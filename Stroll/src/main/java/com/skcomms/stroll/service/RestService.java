package com.skcomms.stroll.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skcomms.stroll.entity.Actor;
import com.skcomms.stroll.entity.City;

@Service
public interface RestService {

	public List<City> getlist();
	public List<City> getMybatisList(City city);
	public List<City> getMybatis1List(City city);
	public List<City> getMybatis2List(City city);
	
	
//	public List<Actor> getActorList(Actor actor);
//	public Actor getActorOne(Actor actor);
//	public int updateActor(Actor actor);
//	public int deleteActor(Actor actor);
//	public int insertActor(Actor actor);
	
	
}
