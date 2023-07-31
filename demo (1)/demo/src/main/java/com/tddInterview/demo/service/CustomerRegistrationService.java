package com.tddInterview.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tddInterview.demo.entity.Customer;
import com.tddInterview.demo.entity.CustomerResponse;
import com.tddInterview.demo.repository.CustomerRepository;

@Service
public class CustomerRegistrationService {

    private CustomerRepository repository;

    @Autowired
    public CustomerRegistrationService(CustomerRepository repository) {
        this.repository = repository;
    }

    public CustomerResponse register(Customer request) {

        CustomerResponse newResponse = new CustomerResponse();

        try {
            if(request.getCustomerId()==null){
                request.setCustomerId(UUID.randomUUID());
            }
            repository.save(request);
            newResponse.setResponseCode("00");
            newResponse.setResponseMessage("Success");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            newResponse.setResponseCode("99");
            newResponse.setResponseMessage("Failed To save");
        }

        return newResponse;

    }

    // public Iterable<Customer> getAllCustomer(){

    // Iterable<Customer> customer= new Iterable<Customer>() {

    // try {
    // customer=repository.findAll();
    // } catch (Exception e) {
    // // TODO: handle exception

    // }

    // return customer;

    // }
    // }
}
