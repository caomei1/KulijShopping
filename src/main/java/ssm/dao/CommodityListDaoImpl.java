package ssm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssm.dao.mappers.CommodityListMapper;
import ssm.entity.SellerCommodityList;

@Repository
public class CommodityListDaoImpl implements CommodityListDao {

	@Autowired
	private CommodityListMapper commodityListMapper;
	
	@Override
	public List<SellerCommodityList> findSellerCommodityList() {
		return commodityListMapper.findSellerCommodityList();
	}

	@Override
	public void deletePicture(int id) {
		commodityListMapper.deletePicture(id);
	}

	@Override
	public void deleteCommodity(int id) {
		commodityListMapper.deleteCommodity(id);
	}

}
