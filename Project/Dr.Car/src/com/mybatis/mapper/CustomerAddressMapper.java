package com.mybatis.mapper;

import com.mybatis.entities.CustomerAddress;

public interface CustomerAddressMapper {

	public void insertCustomerAddress(CustomerAddress c);

	 public void updateCustomerAddress(CustomerAddress c);

	 public void deleteCustomerAddress(Integer cId);
}
