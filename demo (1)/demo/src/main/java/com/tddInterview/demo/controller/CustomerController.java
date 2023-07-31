package com.tddInterview.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tddInterview.demo.entity.Customer;
import com.tddInterview.demo.entity.CustomerResponse;
import com.tddInterview.demo.repository.CustomerRepository;
import com.tddInterview.demo.service.CustomerRegistrationService;

import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRegistrationService customerRepository;



    
                @PostMapping("/register")
                @ResponseBody
                public CustomerResponse registerStudent(@RequestBody  Customer request){
                    CustomerResponse customer = new CustomerResponse();

                    customer= customerRepository.register(request);


                        return customer;
                }

                //  @GetMapping("/getAllCustomer")
                // @ResponseBody
                
                // public Iterable<Customer> getAllCustomer(){
                //     Iterable<Customer> customer = new Iterable<Customer>() ;

                    


                //         return customer;
                // }

}
