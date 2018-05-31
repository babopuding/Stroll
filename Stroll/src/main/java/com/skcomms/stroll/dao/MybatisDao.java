package com.skcomms.stroll.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.skcomms.stroll.common.dao.AbstractCommonDao;
import com.skcomms.stroll.entity.City;

@Component
public class MybatisDao {

	@Autowired
	@Resource
	private SqlSessionTemplate sqlSession;
	
	public List<City> getMybatisList(City city){
		
		 List<City> result = sqlSession.selectList("getMybatisList", city);
		 
		return result;
	}
	
}
