package ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.dao.CommodityDao;
import ssm.entity.CommodityClassify;

@Service
public class CommodityServiceImpl implements CommodityService{

	@Autowired
	private CommodityDao commodityDao;

	@Override
	public List<CommodityClassify> findCommodityClassify() {
		return commodityDao.findCommodityClassify();
	}

}
