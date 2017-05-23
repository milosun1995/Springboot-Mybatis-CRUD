package com.example.springboot.service;

import java.util.List;

import com.example.springboot.domain.City;

public interface CityService {
	
	List<City> findAllCity();
	
	City findCityById(Long id);
	
	Long saveCity(City city);
	
	Long updateCityById(City city);
	
	Long deleteCityById(Long id);
}
