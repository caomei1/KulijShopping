package ssm.service;

import java.util.List;

import ssm.entity.SellerCommodityList;

public interface CommodityListService {

	List<SellerCommodityList> findSellerCommodityList();

	void deletePicture(int id);

	void deleteCommodity(int id);

}
