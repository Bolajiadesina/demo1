package com.tddInterview.demo.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CustomerResponse {

    private String responseCode;
    private String responseMessage;
    
}
