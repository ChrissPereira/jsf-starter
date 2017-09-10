package com.konstpan.jee.jsfstarter.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ViewScoped;

import com.konstpan.jee.jsfstarter.domain.Car;

@ViewScoped
public class CarBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Car> cars;

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}

}
