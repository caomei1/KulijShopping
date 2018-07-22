package ssm.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ssm.entity.CommodityClassify;
import ssm.entity.CommodityPicture;
import ssm.entity.SellerCommodityList;
import ssm.entity.User;
import ssm.service.CommodityListService;
import ssm.service.CommodityService;

@Controller
public class ProlistController {

	@Autowired
	private CommodityService commodityService;
	
	@Autowired
	private CommodityListService commodityListService;
	
	private String uploadDir = "D:/java/picture";
	
	private File file = new File("D:\\java\\picture");

	// @AuthenticationPrincipal(expression = "user") User user
	@RequestMapping(method = RequestMethod.GET, value = "/vip-product")
	public String vipProduct(Model model, 
			@AuthenticationPrincipal(expression = "user") User user) {
		//查询所有商品分类
		List<CommodityClassify> comClassify = 
				commodityService.findCommodityClassify();
		model.addAttribute("comClassify", comClassify);
		return "vip-product";
	}
	
	// 添加商品
	@RequestMapping(method = RequestMethod.POST, value = "/addCommodity")
	public String addCommodity(@ModelAttribute SellerCommodityList commodity, 
			@ModelAttribute CommodityPicture comPicture,  Model model, 
			@AuthenticationPrincipal(expression = "user") User user, 
			RedirectAttributes redirectAttributes) throws Exception {
		//添加商品信息,把用户设进表单
		commodity.setUserId(user.getUserId());
		commodityService.addCommodity(commodity);
		model.addAttribute("Success","添加商品成功");
		//查询所有商品列表
		List<SellerCommodityList> comListAll = 
				commodityService.findAllCommodityList();
		//获取最后一个商品对象
		SellerCommodityList sellerCommodityList = comListAll.get(comListAll.size()-1);
		//添加商品图片
		List<MultipartFile> pictures = comPicture.getPicture();
		//循环添加次数
		for(int i=0; i<=1; i++) {
				String filename = pictures.get(i).getOriginalFilename();
				String newFileName = String.valueOf(System.currentTimeMillis()) + filename;
				if(filename.equals("")) {
					break;
				} else {
					comPicture.getPicture().get(i).transferTo(new File(uploadDir, newFileName));
					comPicture.setCommodityPictureUrl(newFileName);
					comPicture.setSellerCommodityListId(sellerCommodityList.getSellerCommodityId());
					commodityService.addCommodityPicture(comPicture);
				}
				// RedirectAttributes同时还可以作为Model用(addAttribute)，添加flash属性必须用addFlashAttribute
				redirectAttributes.addFlashAttribute("save");
			}
		return "redirect:/vip-product";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/vip-prolist")
	public String vipProlist(Model model, 
			@AuthenticationPrincipal(expression = "user") User user) {
		//查询卖家的所有商品列表
		List<SellerCommodityList> sellerComList = 
				commodityListService.findSellerCommodityList();
		model.addAttribute("sellerComList", sellerComList);
		return "vip-prolist";
	}
	
	//删除卖家列表中的商品
	@RequestMapping(method = RequestMethod.GET, value = "/deleteCommodity/{id}")
	public String deleteCommodity(@PathVariable int id) {
		List<SellerCommodityList> sellerComList = 
				commodityListService.findSellerCommodityList();
		//删除文件夹中的图片
		File [] files = file.listFiles();
		for(SellerCommodityList sellerComLists : sellerComList) {
			if(id == sellerComLists.getSellerCommodityId()) { //传入的id==商品id
				for(int i=0; i<=sellerComLists.getCommodityPicture().size()-1; i++) {
					if(sellerComLists.getSellerCommodityId() == 
							sellerComLists.getCommodityPicture().get(i)
							.getSellerCommodityListId()) {
						for (int j = 0; j < files.length; j++) {
				            File file1 = files[j];
//				            System.out.println("图片名:"+file1.getName()); //根据后缀判断
				            if(file1.getName().equals(
				            		sellerComLists.getCommodityPicture().get(i)
				            		.getCommodityPictureUrl())) {
				            	file1.delete();
				            	System.out.println("删除图片："+file1.getName());
				            }
				        }
					}
				}
			}
		}
		//删除图片
		commodityListService.deletePicture(id);
		//删除商品
		commodityListService.deleteCommodity(id);
		return "redirect:/vip-prolist";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/prolist")
	public String index() {
		return "prolist";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/buyinfo")
	public String buyinfo() {
		return "buyinfo";
	}

}
