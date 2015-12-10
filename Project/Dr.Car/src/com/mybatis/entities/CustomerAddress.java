package com.mybatis.entities;

public class CustomerAddress {

	private Integer cid;
    private String streetName;
    private String cityName;
    private int streetNumber;
    private Integer postalCode;
    private int phoneNumber;
    
	public CustomerAddress() {
	}

	public CustomerAddress(Integer id) {
		this.cid = id;
	}

	

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

}
