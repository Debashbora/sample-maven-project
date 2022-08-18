package com.sevya.carmodeldata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sevya.carmodeldata.entities.Car;
import com.sevya.carmodeldata.services.CarService;

@Controller 
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	private CarService carModelService;
	
	@RequestMapping(value = {"", "/home"})
	public String carDetails(Model model) {
		model.addAttribute("listOfCarModel", carModelService.getAllCarDetails());
		return "car_models";
	}
	
	@RequestMapping("/add")
	public String addCar() {
		return "add_car";
	}
	
	@RequestMapping(value = "/added" , method = RequestMethod.POST )
	public String carAdded(Car carModel) {
		carModelService.saveCar(carModel);
		return "redirect:home";
	}
	
	@RequestMapping("/edit")
	public String editCar(@RequestParam Integer id, Model model) {
		model.addAttribute("car" , carModelService.getCarModel(id));
		return "edit_car";
	}
	
	@RequestMapping(value = "/edited", method = RequestMethod.POST)
	public String carEdited(Car carModel) {
		carModelService.updateCar(carModel);
		return "redirect:home";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam Integer id) {
		carModelService.deleteCar(id);
		return "redirect:home";
	}
	
	
}
