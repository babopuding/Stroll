package com.skcomms.stroll.entity;

public class City {

	private Integer id;
	private String name;
	private String CountryCode;
	private String District;
	private Double Population;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public Double getPopulation() {
		return Population;
	}
	public void setPopulation(Double population) {
		Population = population;
	}
}
