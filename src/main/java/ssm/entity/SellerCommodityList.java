package ssm.entity;

import java.util.List;

public class SellerCommodityList {
	
	private Integer sellerCommodityId; //卖家商品列表id

	private Integer userId;		//用户id
	
	private Integer shopId;		//店铺id
	
	private String commodityClassifyName; //商品分类
	
	private String sellerCommodityName;	//商品名称
	
	private String sellerCommodityPrice;	//商品价格，分为单位
	
	private String sellerCommodityCommision; //商品佣金
	
	private String sellerCommodityFreight; //商品运费
	
	private Integer sellerCommodityStock; //商品库存
	
	private String sellerCommodityDescribe; //商品描述
	
	private Integer sellerCommodityState; //商品状态, 默认'0'未上架
	
	private Commodity commodity;  //商品
	
	private List<CommodityPicture> commodityPicture; //商品图片
	
	public List<CommodityPicture> getCommodityPicture() {
		return commodityPicture;
	}

	public void setCommodityPicture(List<CommodityPicture> commodityPicture) {
		this.commodityPicture = commodityPicture;
	}

	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Integer getSellerCommodityId() {
		return sellerCommodityId;
	}

	public void setSellerCommodityId(Integer sellerCommodityId) {
		this.sellerCommodityId = sellerCommodityId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getCommodityClassifyName() {
		return commodityClassifyName;
	}

	public void setCommodityClassifyName(String commodityClassifyName) {
		this.commodityClassifyName = commodityClassifyName;
	}

	public String getSellerCommodityName() {
		return sellerCommodityName;
	}

	public void setSellerCommodityName(String sellerCommodityName) {
		this.sellerCommodityName = sellerCommodityName;
	}

	public String getSellerCommodityPrice() {
		return sellerCommodityPrice;
	}

	public void setSellerCommodityPrice(String sellerCommodityPrice) {
		this.sellerCommodityPrice = sellerCommodityPrice;
	}

	public String getSellerCommodityCommision() {
		return sellerCommodityCommision;
	}

	public void setSellerCommodityCommision(String sellerCommodityCommision) {
		this.sellerCommodityCommision = sellerCommodityCommision;
	}

	public String getSellerCommodityFreight() {
		return sellerCommodityFreight;
	}

	public void setSellerCommodityFreight(String sellerCommodityFreight) {
		this.sellerCommodityFreight = sellerCommodityFreight;
	}

	public Integer getSellerCommodityStock() {
		return sellerCommodityStock;
	}

	public void setSellerCommodityStock(Integer sellerCommodityStock) {
		this.sellerCommodityStock = sellerCommodityStock;
	}

	public String getSellerCommodityDescribe() {
		return sellerCommodityDescribe;
	}

	public void setSellerCommodityDescribe(String sellerCommodityDescribe) {
		this.sellerCommodityDescribe = sellerCommodityDescribe;
	}

	public Integer getSellerCommodityState() {
		return sellerCommodityState;
	}

	public void setSellerCommodityState(Integer sellerCommodityState) {
		this.sellerCommodityState = sellerCommodityState;
	}

	@Override
	public String toString() {
		return "SellerCommodityList [sellerCommodityId=" + sellerCommodityId + ", userId=" + userId + ", shopId="
				+ shopId + ", commodityClassifyName=" + commodityClassifyName + ", sellerCommodityName="
				+ sellerCommodityName + ", sellerCommodityPrice=" + sellerCommodityPrice + ", sellerCommodityCommision="
				+ sellerCommodityCommision + ", sellerCommodityFreight=" + sellerCommodityFreight
				+ ", sellerCommodityStock=" + sellerCommodityStock + ", sellerCommodityDescribe="
				+ sellerCommodityDescribe + ", sellerCommodityState=" + sellerCommodityState + ", commodity="
				+ commodity + ", commodityPicture=" + commodityPicture + "]";
	}
	
}
