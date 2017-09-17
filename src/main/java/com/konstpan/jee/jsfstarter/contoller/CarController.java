package com.konstpan.jee.jsfstarter.contoller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.konstpan.jee.jsfstarter.bean.CarBean;
import com.konstpan.jee.jsfstarter.service.CarService;

@Named
@ViewScoped
public class CarController implements Serializable {

	private static final long serialVersionUID = 1L;

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
