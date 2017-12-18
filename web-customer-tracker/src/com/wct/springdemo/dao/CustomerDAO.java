package com.wct.springdemo.dao;

import java.util.List;

import com.wct.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

}
