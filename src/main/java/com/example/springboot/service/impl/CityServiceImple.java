package com.example.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dao.CityDao;
import com.example.springboot.domain.City;
import com.example.springboot.service.CityService;

@Service
public class CityServiceImple implements CityService{
	@Autowired
	private CityDao cityDao;
	
	@Override
	public List<City> findAllCity() {
		
		return cityDao.findAllCity();
	}

	@Override
	public City findCityById(Long id) {
		
		return cityDao.findCityById(id);
	}

	@Override
	public Long saveCity(City city) {
		
		return cityDao.saveCity(city);
	}

	@Override
	public Long updateCityById(City city) {
		
		return cityDao.updateCityById(city);
	}

	@Override
	public Long deleteCityById(Long id) {
		
		return cityDao.deleteCityById(id);
	}

}
