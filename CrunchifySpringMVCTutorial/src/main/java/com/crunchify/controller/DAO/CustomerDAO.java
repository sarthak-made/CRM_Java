package com.crunchify.controller.DAO;

import java.util.List;

import com.crunchify.controller.CustomerPOJO.Customer;

public interface CustomerDAO {
	List<Customer> loadCustomers();
}
