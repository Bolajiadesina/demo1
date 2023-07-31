package com.tddInterview.demo.CustomerControllerTest;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tddInterview.demo.entity.Customer;

public class ControllerTest {



    


                @RequestMapping("/register")
                @ResponseBody
                public Customer registerStudent(@RequestBody  Customer request){
                    Customer customer = new Customer(null, null, null, null, null);

                    


                        return customer;
                }




    
}
