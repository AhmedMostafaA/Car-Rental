package com.mybatis.mapper;

import com.mybatis.entities.Customer;
import com.mybatis.entities.ObjectLog;

public interface CustomerMapper {

	public void insertCustomer(Customer c);

	public Customer getCustomerById(Integer cId);
	
	public Customer checkCustomer(ObjectLog obj);

	public void updateCustomer(Customer c);

	public void deleteCustomer(Integer cId);
}
