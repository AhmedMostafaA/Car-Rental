package com.mybatis.entities;

public class CarType {

	private Integer id;
	private String name;
	private String producer;
	private String type;
	private boolean automatic;
	private Car car;

	public CarType() {
	}

	public CarType(Integer id) {
		this.id = id;
	}

	public CarType(Integer id, String name, String producer, String type, boolean automatic) {
		this.id = id;
		this.name = name;
		this.producer = producer;
		this.type = type;
		this.automatic = automatic;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "entities.CarType[ id=" + id + " ]";
	}

}
