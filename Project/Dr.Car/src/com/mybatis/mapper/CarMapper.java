package com.mybatis.mapper;

import java.util.List;
import com.mybatis.entities.Car;

public interface CarMapper {

	public List<Car> getAllCar();

	public Car getCarById(Integer cId);
	
	public List<Car> getCarBytype(String type);

	public void getallbooking (Integer cId);
}
