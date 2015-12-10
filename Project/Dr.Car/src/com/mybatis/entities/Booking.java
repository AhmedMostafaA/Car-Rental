package com.mybatis.entities;

import java.sql.Date;

public class Booking {

	private Integer bookingNumber;
	private String bookingDate;
	private String returnDate;
	private Integer idCar;
	private Integer idCustomer;

	public Booking() {
	}

	public Booking(Integer bookingNumber) {
		this.bookingNumber = bookingNumber;
	}


	public Integer getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(Integer bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public Integer getIdCar() {
		return idCar;
	}

	public void setIdCar(Integer idCar) {
		this.idCar = idCar;
	}

	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	@Override
	public String toString() {
		return "Booking [bookingNumber=" + bookingNumber + ", bookingDate=" + bookingDate + ", returnDate=" + returnDate
				+ ", idCar=" + idCar + ", idCustomer=" + idCustomer + "]";
	}

	

	

}
