package com.water.quato.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.water.quato.bean.Information;
import com.water.quato.mapper.InformationMapper;
import com.water.quato.service.InformationService;

@Service("informationService")
public class InformationServiceImpl implements InformationService{
	
	@Resource
	private InformationMapper informationMapper;

	@Override
	public boolean insert(Map<String, Object> information) {
		
		try {
			informationMapper.insert(information);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Information find(int id) {
		return informationMapper.find(id);
	}

	@Override
	public List<Information> findAll() {
		// TODO Auto-generated method stub
		return informationMapper.findAll();
	}

}
