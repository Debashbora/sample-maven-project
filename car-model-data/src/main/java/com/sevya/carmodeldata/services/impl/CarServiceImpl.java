package com.sevya.carmodeldata.services.impl;

import java.util.List;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevya.carmodeldata.daos.CarDao;
import com.sevya.carmodeldata.entities.Car;
import com.sevya.carmodeldata.services.CarService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDao carDao;
	
	@Override
	public List<Car> getAllCarDetails() {
		return carDao.fetchAll();
	}
	
	@Override
	public void saveCar(Car carModel) {
		carDao.saveOne(carModel);
	}
	
	@Override
	public Car getCarModel(Integer id) {
		return carDao.fetch(id);
	}
	
	@Override
	public void updateCar(Car carModel) {
		carDao.update(carModel);
	}

	@Override
	public void deleteCar(Integer id) {
		carDao.delete(id);
	}

}


