package com.SpringBoot.MyString.repository;

import com.SpringBoot.MyString.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
