package com.SpringBoot.MyString.service;

import com.SpringBoot.MyString.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer getCustomerById(Long customerId);
    List<Customer> getAllCustomers();
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Long customerId);
}
