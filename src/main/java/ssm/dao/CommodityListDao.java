package ssm.dao;

import java.util.List;

import ssm.entity.SellerCommodityList;

public interface CommodityListDao {

	List<SellerCommodityList> findSellerCommodityList();

	void deletePicture(int id);

	void deleteCommodity(int id);

}
