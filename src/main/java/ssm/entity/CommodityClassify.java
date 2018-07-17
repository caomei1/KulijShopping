package ssm.entity;

public class CommodityClassify {
	
	private Integer commodityClassifyId; //商品分类id
	
	private String commodityClassifyName; //类型

	public Integer getCommodityClassifyId() {
		return commodityClassifyId;
	}

	public void setCommodityClassifyId(Integer commodityClassifyId) {
		this.commodityClassifyId = commodityClassifyId;
	}

	public String getCommodityClassifyName() {
		return commodityClassifyName;
	}

	public void setCommodityClassifyName(String commodityClassifyName) {
		this.commodityClassifyName = commodityClassifyName;
	}

	@Override
	public String toString() {
		return "CommodityClassify [commodityClassifyId=" + commodityClassifyId + ", commodityClassifyName="
				+ commodityClassifyName + "]";
	}

}
