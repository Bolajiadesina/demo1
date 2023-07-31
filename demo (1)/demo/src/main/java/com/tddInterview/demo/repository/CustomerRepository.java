package com.tddInterview.demo.repository;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.tddInterview.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;

@Service
public interface CustomerRepository   extends CrudRepository<Customer, UUID> {
    
}
