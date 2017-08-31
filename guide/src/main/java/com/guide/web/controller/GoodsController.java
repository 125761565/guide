package com.guide.web.controller;

import java.util.List;

import javax.ws.rs.core.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.guide.entity.Goods;
import com.guide.service.IGoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	
	@Autowired
	private IGoodsService goodsService;
	/****
	 * 首页商品展示
	 */
	@RequestMapping(value = "/list",method=RequestMethod.GET)
	public ModelAndView getGoods() {
		//List<Goods> gList=goodsService.getGoods();
		ModelAndView modelAndView = new ModelAndView();
	//	modelAndView.addObject("gList", gList);	
		modelAndView.addObject("name","zhang");
		modelAndView.setViewName("index");
		return modelAndView;
	}

}
