package ssm.dao.mappers;

import java.util.List;

import ssm.entity.CommodityClassify;
import ssm.entity.CommodityPicture;
import ssm.entity.SellerCommodityList;

public interface CommodityMapper {

	List<CommodityClassify> findCommodityClassify();

	void addCommodity(SellerCommodityList commodity);

	void addCommodityPicture(CommodityPicture comPicture);

	List<SellerCommodityList> findAllCommodityList();

}
