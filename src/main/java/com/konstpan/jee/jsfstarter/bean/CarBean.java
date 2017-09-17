package com.konstpan.jee.jsfstarter.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.konstpan.jee.jsfstarter.domain.Car;

@Named
@ViewScoped
public class CarBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Car> cars;
	private List<Car> carsFiltered;

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}

	public List<Car> getCarsFiltered() {
		return carsFiltered;
	}

	public void setCarsFiltered(List<Car> carsFiltered) {
		this.carsFiltered = carsFiltered;
	}

}
