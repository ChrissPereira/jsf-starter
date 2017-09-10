package com.konstpan.jee.jsfstarter.contoller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.konstpan.jee.jsfstarter.bean.CarBean;
import com.konstpan.jee.jsfstarter.service.CarService;

@Named
@ViewScoped
public class CarController {

	@Inject
	private CarService service;
	
	@Inject
	private CarBean carBean;

	public CarController() {
		// empty constructor
	}
	
	@PostConstruct
	public void init() {
		carBean.setCars(service.createCars(10));
	}

	public CarBean getCarBean() {
		return carBean;
	}

	public void setCarBean(CarBean carBean) {
		this.carBean = carBean;
	}

}
