package com.guide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guide.dao.IGoodsDao;
import com.guide.entity.Goods;
import com.guide.service.IGoodsService;
@Service
public class GoodsServiceImpl implements IGoodsService {
	@Autowired
	private IGoodsDao goodsDao;
	@Override
	public List<Goods> getGoods() {
		
		return goodsDao.getGoods();
	}

}
