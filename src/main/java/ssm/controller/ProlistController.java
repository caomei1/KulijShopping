package ssm.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ssm.entity.CommodityClassify;
import ssm.entity.CommodityPicture;
import ssm.entity.SellerCommodityList;
import ssm.entity.User;
import ssm.service.CommodityService;

@Controller
public class ProlistController {

	@Autowired
	private CommodityService commodityService;

	// @AuthenticationPrincipal(expression = "user") User user
	@RequestMapping(method = RequestMethod.GET, value = "/vip-product")
	public String vipProduct(Model model, 
			@AuthenticationPrincipal(expression = "user") User user) {
		//查询所有商品分类
		List<CommodityClassify> comClassify = 
				commodityService.findCommodityClassify();
		model.addAttribute("comClassify", comClassify);
		System.out.println(comClassify);
		return "vip-product";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/vip-prolist")
	public String vipProlist(@AuthenticationPrincipal(expression = "user") User user) {
		return "vip-prolist";
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
