package ssm.entity;

import org.springframework.web.multipart.MultipartFile;

public class CommodityPicture {
	
	private Integer commodityPictureId; //商品图片id
	
	private Integer sellerCommodityListId; // 商品列表id
	
	private MultipartFile picture;
	private String commodityPictureUrl; //商品图片
	
	private SellerCommodityList sellerCommodityList; //商品列表
	
	public SellerCommodityList getSellerCommodityList() {
		return sellerCommodityList;
	}
	public void setSellerCommodityList(SellerCommodityList sellerCommodityList) {
		this.sellerCommodityList = sellerCommodityList;
	}
	
	public Integer getCommodityPictureId() {
		return commodityPictureId;
	}
	public void setCommodityPictureId(Integer commodityPictureId) {
		this.commodityPictureId = commodityPictureId;
	}
	public Integer getSellerCommodityListId() {
		return sellerCommodityListId;
	}
	public void setSellerCommodityListId(Integer sellerCommodityListId) {
		this.sellerCommodityListId = sellerCommodityListId;
	}
	public MultipartFile getPicture() {
		return picture;
	}
	public void setPicture(MultipartFile picture) {
		this.picture = picture;
	}
	public String getCommodityPictureUrl() {
		return commodityPictureUrl;
	}
	public void setCommodityPictureUrl(String commodityPictureUrl) {
		this.commodityPictureUrl = commodityPictureUrl;
	}
	
	@Override
	public String toString() {
		return "CommodityPicture [commodityPictureId=" + commodityPictureId + ", sellerCommodityListId="
				+ sellerCommodityListId + ", picture=" + picture + ", commodityPictureUrl=" + commodityPictureUrl + "]";
	}

}
