package com.tddInterview.demo.utils;

import org.springframework.stereotype.Service;

@Service
public class PhoneNumberValidator {

    public boolean itShouldFailWhenPhoneNumberFormatIsNotCorrect(String phoneNumber) {

        return phoneNumber.startsWith("+44") && phoneNumber.length() == 13;

    }

}
