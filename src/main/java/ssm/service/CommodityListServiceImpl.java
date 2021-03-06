package ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.dao.CommodityListDao;
import ssm.entity.SellerCommodityList;

@Service
public class CommodityListServiceImpl implements CommodityListService {

	@Autowired
	private CommodityListDao commodityListDao;
	
	@Override
	public List<SellerCommodityList> findSellerCommodityList() {
		return commodityListDao.findSellerCommodityList();
	}

	@Override
	public void deletePicture(int id) {
		commodityListDao.deletePicture(id);
	}

	@Override
	public void deleteCommodity(int id) {
		commodityListDao.deleteCommodity(id);
	}

}
