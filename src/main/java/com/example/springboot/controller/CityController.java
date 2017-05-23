package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springboot.domain.City;
import com.example.springboot.service.CityService;

@Controller
public class CityController {
	@Autowired
	private CityService cityService;
	
	@RequestMapping(value="cityList",method={RequestMethod.GET,RequestMethod.POST})
	public String beanList(Model m){
		List<City> cityList=cityService.findAllCity();
		m.addAttribute("cityList", cityList);
		return "list";
		
	}
	
	@RequestMapping(value="cityNew",method={RequestMethod.GET,RequestMethod.POST})
	public String beanNew(Model m){
		City bean=new City();
		m.addAttribute("bean",bean);
		return "edit";
		
	}
	
	@RequestMapping(value="citySave",method={RequestMethod.GET,RequestMethod.POST})
	public String beanSave(City city){
		try {
			if(null!=city.getId()){		
				cityService.updateCityById(city);
			}else{
				cityService.saveCity(city);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:cityList";
		
	}
	
	@RequestMapping(value="cityUpdate",method={RequestMethod.GET,RequestMethod.POST})
	public String beanUpdate(Long id,Model m){
		try {
			City bean= cityService.findCityById(id);
			m.addAttribute("bean", bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "edit";
		
	}
	
	@RequestMapping(value="cityDelete",method={RequestMethod.GET,RequestMethod.POST})
	public String beanDelete(Long id){
		try {
			cityService.deleteCityById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:cityList";
		
	}
	
}
