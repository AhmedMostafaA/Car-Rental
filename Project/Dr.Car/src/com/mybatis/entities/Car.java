package com.mybatis.entities;

import java.sql.Date;
import java.util.List;

public class Car {

	private Integer id;
	private String color;
	private int basePricePerDay;
	private Date dateOfManufacturing;
	private List<Booking> bookingCollection;
	private CarType carType;
	private String link;

	public Car() {
	}

	public Car(Integer id) {
		this.id = id;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBasePricePerDay() {
		return basePricePerDay;
	}

	public void setBasePricePerDay(int basePricePerDay) {
		this.basePricePerDay = basePricePerDay;
	}

	public Date getDateOfManufacturing() {
		return dateOfManufacturing;
	}

	public void setDateOfManufacturing(Date dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}

	public List<Booking> getBookingCollection() {
		return bookingCollection;
	}

	public void setBookingCollection(List<Booking> bookingCollection) {
		this.bookingCollection = bookingCollection;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + ", basePricePerDay=" + basePricePerDay + ", dateOfManufacturing="
				+ dateOfManufacturing + ", bookingCollection=" + bookingCollection + ", carType=" + carType + ", link="
				+ link + "]";
	}

}
