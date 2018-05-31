package com.skcomms.stroll.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.skcomms.stroll.entity.City;

@Component
public class MysqlDao {

	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MysqlDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public void insertContent(String content) {
		jdbcTemplate.update("INSERT INTO blogs(content) VALUES(?)", content);
	}
	
	public List<City> getList(){
		
		List<City> cityList = new ArrayList<City>();
		
		String query = "SELECT * FROM CITY LIMIT 100";
		cityList = jdbcTemplate.query(query, new BeanPropertyRowMapper<City>(City.class));
		
		return cityList;
	}
	
}
