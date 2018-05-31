package com.skcomms.stroll.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcomms.stroll.dao.Mybatis1Dao;
import com.skcomms.stroll.dao.Mybatis2Dao;
import com.skcomms.stroll.dao.MybatisDao;
import com.skcomms.stroll.dao.MysqlDao;
import com.skcomms.stroll.dao.SadminDao;
import com.skcomms.stroll.dao.SmapDao;
import com.skcomms.stroll.entity.Actor;
import com.skcomms.stroll.entity.City;

@Service("restService")
public class RestServiceImpl implements RestService {

	@Autowired
	private MysqlDao mysqlDao;
	
	@Autowired
	private MybatisDao mybatisDao;
	
	@Autowired
	private Mybatis1Dao mybatis1Dao;
	
	@Autowired
	private Mybatis2Dao mybatis2Dao;
	
	@Autowired
	private SmapDao smapDao;
	
	@Autowired
	private SadminDao sadminDao;
	
	//method1
	@Override
	public List<City> getlist(){
		List<City> returnCity = new ArrayList<City>();
		returnCity = mysqlDao.getList();
		return returnCity;
	}
	
	//method2
	@Override
	public List<City> getMybatisList(City city){
		List<City> returnCity = new ArrayList<City>();
		returnCity = mybatisDao.getMybatisList(city);
		
		return returnCity;
	}
	
	//method2-1
	@Override
	public List<City> getMybatis1List(City city){
		List<City> returnCity = new ArrayList<City>();
		returnCity = (List<City>) mybatis1Dao.selectList("getMybatisList", city);
		
		return returnCity;
	}
	
	//method2-2
	@Override
	public List<City> getMybatis2List(City city){
		List<City> returnCity = new ArrayList<City>();
		returnCity = (List<City>) mybatis2Dao.selectList("getMybatisList", city);
		return returnCity;
	}
	
	//method3
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Actor> getActorList(Actor actor) {
//		List<Actor> result = (List<Actor>) smapDao.selectList("getActorList", actor);
//		return result;
//	}
//	
//	@Override
//	public Actor getActorOne(Actor actor) {
//		Actor result = (Actor) smapDao.selectOne("com.skcomms.stroll.map.map_mysql.getActorOne", actor);
//		return result;
//	
//	}
//	
//	@Override
//	public int updateActor(Actor actor) {
//		int result = smapDao.update("com.skcomms.stroll.map.map_mysql.updateActor", actor);
//		return result;
//	}
//	
//	@Override
//	public int deleteActor(Actor actor) {
//		int result = smapDao.update("com.skcomms.stroll.map.map_mysql.deleteActor", actor);
//		return result;
//	}
//	
//	@Override
//	public int insertActor(Actor actor) {
//		int result = (int) smapDao.insert("com.skcomms.stroll.map.map_mysql.insertActor", actor);
//		return result;
//	}
	
	
}
