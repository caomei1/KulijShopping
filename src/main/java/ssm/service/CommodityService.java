package ssm.service;

import java.util.List;

import ssm.entity.CommodityClassify;
import ssm.entity.CommodityPicture;
import ssm.entity.SellerCommodityList;

public interface CommodityService {

	List<CommodityClassify> findCommodityClassify();

	void addCommodity(SellerCommodityList comList);

	void addCommodityPicture(CommodityPicture comPicture);

	List<SellerCommodityList> findAllSellerCommodityList();
	
}
