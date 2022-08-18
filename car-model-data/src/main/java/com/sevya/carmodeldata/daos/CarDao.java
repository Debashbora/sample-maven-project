package com.sevya.carmodeldata.daos;

import java.util.List;

import com.sevya.carmodeldata.entities.Car;

public interface CarDao {
	public abstract List<Car> fetchAll();
	public void saveOne(Car car);
	public Car fetch(Integer id);
	public  void update(Car car);
	public void delete(Integer id);
}
