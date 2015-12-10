package com.mybatis.entities;

import java.sql.Date;
import java.util.List;

public class Customer {

	private Integer id;
    private String loginName;
    private String email;
    private String customerType;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String password;
    private String companyName;
    private boolean gender;
    private String nationality;
    private List<Booking> bookingList;
    private CustomerAddress customerAdd;

	public Customer() {
	}

	public Customer(Integer id) {
		this.id = id;
	}



	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public List<Booking> getBookingList() {
		return bookingList;
	}

	public void setBookingList(List<Booking> bookingList) {
		this.bookingList = bookingList;
	}

	public CustomerAddress getCustomerAdd() {
		return customerAdd;
	}

	public void setCustomerAdd(CustomerAddress customerAdd) {
		this.customerAdd = customerAdd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

}
