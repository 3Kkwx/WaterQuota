package com.water.quato.service;

import java.util.List;
import java.util.Map;

import com.water.quato.bean.Information;

public interface InformationService {

	public boolean insert(Map<String, Object> params);
	public Information find(int id);
	public List<Information> findAll();
}
