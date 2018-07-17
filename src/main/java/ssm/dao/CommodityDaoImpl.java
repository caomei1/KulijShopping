package ssm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssm.dao.mappers.CommodityMapper;
import ssm.entity.CommodityClassify;

@Repository
public class CommodityDaoImpl implements CommodityDao {
	
	@Autowired
	private CommodityMapper commodityMapper;

	@Override
	public List<CommodityClassify> findCommodityClassify() {
		return commodityMapper.findCommodityClassify();
	}
}
