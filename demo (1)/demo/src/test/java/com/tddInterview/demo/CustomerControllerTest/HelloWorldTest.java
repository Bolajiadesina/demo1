package com.tddInterview.demo.CustomerControllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tddInterview.demo.controller.HelloController;

public class HelloWorldTest {

        @Test
        void hello(){
            String expected = "HelloWorld";
            HelloController controller=  new HelloController();
            String   response= controller.hello(expected);
            assertEquals(expected,response);
            
        }


    
}
