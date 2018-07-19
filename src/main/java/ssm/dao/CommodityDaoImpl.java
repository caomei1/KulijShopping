package ssm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssm.dao.mappers.CommodityMapper;
import ssm.entity.CommodityClassify;
import ssm.entity.CommodityPicture;
import ssm.entity.SellerCommodityList;

@Repository
public class CommodityDaoImpl implements CommodityDao {
	
	@Autowired
	private CommodityMapper commodityMapper;

	@Override
	public List<CommodityClassify> findCommodityClassify() {
		return commodityMapper.findCommodityClassify();
	}

	@Override
	public void addCommodity(SellerCommodityList commodity) {
		commodityMapper.addCommodity(commodity);
	}

	@Override
	public void addCommodityPicture(CommodityPicture comPicture) {
		commodityMapper.addCommodityPicture(comPicture);
	}

	@Override
	public List<SellerCommodityList> findAllCommodityList() {
		return commodityMapper.findAllCommodityList();
	}

}
