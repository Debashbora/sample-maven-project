package com.sevya.carmodeldata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cars")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String manufacturer;
	
	@Column(name = "model_name")
	private String modelName;
	
	@Column(name = "engine_size")
	private Integer engineSize;

	private String variant;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(Integer engineSize) {
		this.engineSize = engineSize;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}
	
	public Car() {
		
	}

	public Car(Integer id, String manufacturer, String modelName, Integer engineSize, String variant) {
		super();
		this.id = id;
		this.manufacturer = manufacturer;
		this.modelName = modelName;
		this.engineSize = engineSize;
		this.variant = variant;
	}

	@Override
	public String toString() {
		return "CarModels [id=" + id + ", manufacturer=" + manufacturer + ", modelName=" + modelName + ", engineSize="
				+ engineSize + ", variant=" + variant + "]";
	}
	
	
}
