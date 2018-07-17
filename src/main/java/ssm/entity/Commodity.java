package ssm.entity;

public class Commodity {
	
	private Integer commodityId;//商品id
	
	private Integer userId;		//用户id
	
	private Integer shopId;		//店铺id
	
	private String commodityClassifyName; //商品分类
	
	private String commodityName;	//商品名称
	
	private Integer commodityPrice;	//商品价格，分为单位
	
	private Integer commodityCommision; //商品佣金
	
	private Integer commodityFreight; //商品运费
	
	private Integer commodityStock; //商品库存
	
	private String commodityDescribe; //商品描述
	
	private String commodityTime; //商品上架时间

	public Integer getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
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

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public Integer getCommodityPrice() {
		return commodityPrice;
	}

	public void setCommodityPrice(Integer commodityPrice) {
		this.commodityPrice = commodityPrice;
	}

	public Integer getCommodityCommision() {
		return commodityCommision;
	}

	public void setCommodityCommision(Integer commodityCommision) {
		this.commodityCommision = commodityCommision;
	}

	public Integer getCommodityFreight() {
		return commodityFreight;
	}

	public void setCommodityFreight(Integer commodityFreight) {
		this.commodityFreight = commodityFreight;
	}

	public Integer getCommodityStock() {
		return commodityStock;
	}

	public void setCommodityStock(Integer commodityStock) {
		this.commodityStock = commodityStock;
	}

	public String getCommodityDescribe() {
		return commodityDescribe;
	}

	public void setCommodityDescribe(String commodityDescribe) {
		this.commodityDescribe = commodityDescribe;
	}

	public String getCommodityTime() {
		return commodityTime;
	}

	public void setCommodityTime(String commodityTime) {
		this.commodityTime = commodityTime;
	}

	@Override
	public String toString() {
		return "Commodity [commodityId=" + commodityId + ", userId=" + userId + ", shopId=" + shopId
				+ ", commodityClassifyName=" + commodityClassifyName + 
				 ", commodityName=" + commodityName + ", commodityPrice=" + commodityPrice + ", commodityCommision="
				+ commodityCommision + ", commodityFreight=" + commodityFreight + ", commodityStock=" + commodityStock
				+ ", commodityDescribe=" + commodityDescribe + ", commodityTime=" + commodityTime + "]";
	}

}
