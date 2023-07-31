package com.tddInterview.demo.entity;

import java.util.UUID;

import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;




@Data
@ToString
@Entity
public class Customer {

        @Id
        private UUID customerId;


        @NonNull
        private String firstName;

          @NonNull
        private String lastName;
          @NonNull
        private String email;

          @NonNull()
        private String phoneNumber;
        
            public Customer(){}




        public Customer(UUID customerId, String firstName, String lastName, String email, String phoneNumber) {
            this.customerId = customerId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }
        


    
}
