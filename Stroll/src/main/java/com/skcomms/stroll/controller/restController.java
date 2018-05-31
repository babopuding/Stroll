package com.skcomms.stroll.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skcomms.stroll.entity.Actor;
import com.skcomms.stroll.entity.City;
import com.skcomms.stroll.service.RestService;

@RestController
public class restController {

	@Autowired
	private RestService restService;
	
	@RequestMapping(value="getlist", method = RequestMethod.GET)
	public  List<City> getlist() {
		
		List<City> returnCity = new ArrayList<City>();
		
		returnCity = restService.getlist();
		
		return returnCity;
		
	}
	
	@RequestMapping(value="getmlist", method = RequestMethod.GET)
	public  List<City> getmlist() {
		
		List<City> returnCity = new ArrayList<City>();
		
		City city = new City();
		
		returnCity = restService.getMybatisList(city);
		
		return returnCity;
		
	}
	
	@RequestMapping(value="getm2list", method = RequestMethod.GET)
	public  List<City> getm2list() {
		
		List<City> returnCity = new ArrayList<City>();
		City city = new City();
		returnCity = restService.getMybatis2List(city);
		return returnCity;
		
	}
	
	
	@RequestMapping(value="getalist", method = RequestMethod.GET)
	public  List<Actor> getActorList() {
		
		List<Actor> returnActor = new ArrayList<Actor>();
		
		Actor actor = new Actor();
		
//		returnActor = restService.getActorList(actor);
		
		return returnActor;
		
	}
}
