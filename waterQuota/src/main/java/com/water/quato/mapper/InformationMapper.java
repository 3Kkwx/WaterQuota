package com.water.quato.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.water.quato.bean.Information;



@Mapper
public interface InformationMapper {

	public void insert(@Param("information1") Map<String, Object> information1);//插入数据
	public Information find(int id);//查找数据
	public List<Information> findAll();
}
