package ssm.dao.mappers;

import java.util.List;

import ssm.entity.SellerCommodityList;

public interface CommodityListMapper {

	List<SellerCommodityList> findSellerCommodityList();

	void deletePicture(int id);

	void deleteCommodity(int id);

}
