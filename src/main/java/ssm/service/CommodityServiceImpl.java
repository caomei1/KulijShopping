package ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.dao.CommodityDao;
import ssm.entity.CommodityClassify;
import ssm.entity.CommodityPicture;
import ssm.entity.SellerCommodityList;

@Service
public class CommodityServiceImpl implements CommodityService{

	@Autowired
	private CommodityDao commodityDao;

	@Override
	public List<CommodityClassify> findCommodityClassify() {
		return commodityDao.findCommodityClassify();
	}

	@Override
	public void addCommodity(SellerCommodityList commodity) {
		commodityDao.addCommodity(commodity);
	}

	@Override
	public void addCommodityPicture(CommodityPicture comPicture) {
			commodityDao.addCommodityPicture(comPicture);
	}

	@Override
	public List<SellerCommodityList> findAllCommodityList() {
		return commodityDao.findAllCommodityList();
	}

}
