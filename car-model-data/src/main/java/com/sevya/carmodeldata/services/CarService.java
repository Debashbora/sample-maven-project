package com.sevya.carmodeldata.services;

import java.util.List;

import com.sevya.carmodeldata.entities.Car;

public interface CarService {
	public abstract List<Car> getAllCarDetails();
	public void saveCar(Car carModel);
	public Car getCarModel(Integer id);
	public void updateCar(Car carModel);
	public void deleteCar(Integer id);
	
}
