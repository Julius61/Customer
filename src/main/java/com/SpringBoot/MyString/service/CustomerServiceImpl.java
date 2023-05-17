package com.SpringBoot.MyString.service;

import com.SpringBoot.MyString.entity.Customer;
import com.SpringBoot.MyString.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository;
    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        Optional<Customer> optionalCustomer=customerRepository.findById(customerId);
        return optionalCustomer.get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer customer1=customerRepository.findById(customer.getCustomerId()).get();
        customer1.setCustomerName(customer.getCustomerName());
        customer1.setProductType(customer.getProductType());
        customer1.setCustomerAddress(customer.getCustomerAddress());
        customer1.setCustomerEmail(customer.getCustomerEmail());
        Customer updatedCustomer=customerRepository.save(customer);
        return updatedCustomer;
    }

    @Override
    public void deleteCustomer(Long customerId) {

    }
}
