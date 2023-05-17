package com.SpringBoot.MyString.controller;


import com.SpringBoot.MyString.entity.Customer;
import com.SpringBoot.MyString.repository.CustomerRepository;
import com.SpringBoot.MyString.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/mycustomers")
public class CustomerController {

    private CustomerService customerService;

    //build create customer rest api
    //http://localhost:8189/api/mycustomers
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        Customer mycustomer1=customerService.createCustomer(customer);
        return new ResponseEntity<>(mycustomer1, HttpStatus.CREATED);
    }
    //build get customer by id rest api
    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Long customerId){
        Customer mycustomer2=customerService.getCustomerById(customerId);
        return new ResponseEntity<>(mycustomer2, HttpStatus.OK);
    }

    //BUILD GET ALL Customers Rest api
    @GetMapping({"all"})
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> mycustomer3=customerService.getAllCustomers();
        return new ResponseEntity<>(mycustomer3, HttpStatus.OK);
    }

    //build update customer rest api
    @PutMapping("{id}")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable("id") Long customerId){
        customer.setCustomerId(customerId);
        Customer mycustomer4=customerService.updateCustomer(customer);
        return new ResponseEntity<>(mycustomer4, HttpStatus.OK);
    }


    //build delete customer rest api
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") Long customerId){
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<>("Customer deleted successfully!", HttpStatus.OK);
    }
}
