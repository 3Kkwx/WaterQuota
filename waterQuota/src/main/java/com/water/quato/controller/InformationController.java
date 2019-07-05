package com.water.quato.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.water.quato.bean.Information;
import com.water.quato.service.InformationService;

@Controller
public class InformationController {

	@Resource
	private InformationService informationService;

	
	//客户端输入数据插入到数据库中
	@RequestMapping(value="/InfoSaveresult",method=RequestMethod.POST)
	@ResponseBody
	public String saveInfo(@RequestParam Map<String,Object> params) {
		boolean result = informationService.insert(params);
		String finResult;
		if (result) {
			finResult="添加成功";
		} else {
			finResult="添加失败";
		}
		return finResult;
	}
	
	//从数据库中读取数据到网页上
	@RequestMapping("/indexInfo")
	@ResponseBody //返回的字符串时添加
	public String indexInfo(@RequestParam("id") int id) {
		Information information = informationService.find(id);
		return information.toString();

	}
	//根据id从数据库中读取单条数据到jsp页面中
	@RequestMapping("/infoView")
	public String viewInfo(@RequestParam("id") int id){
		Information information = informationService.find(id);
		HttpServletRequest requestOne = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		requestOne.setAttribute("information", information);
		return "InfoViewIndex";
	}
	
	//从数据库中读取全部数据到网页上
		@RequestMapping("/infoAll")
		public List<Information> allInfo(){
			List<Information> information = informationService.findAll();
			HttpServletRequest requestMore=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
			requestMore.setAttribute("information", information);
			return information;
			
		}
}
