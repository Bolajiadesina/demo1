package com.tddInterview.demo.CustomerServiceTest;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.tddInterview.demo.utils.PhoneNumberValidator;

public class PhoneValidatorTest {

            private PhoneNumberValidator phoneNumberValidator;

    
                @BeforeEach
            void setUp(){
                this.phoneNumberValidator= new PhoneNumberValidator();

            }

               
                // @ParameterizedTest
                // @CsvSource({"+447771298635, true",
                // "+44777129863523,false",
                // "447771298635,false"})

                @Test
                 void checkIfPhoneNoHasCorrectPrefix(){
                    //Given
                    String phoneNumber="+447771298635";
                   
                    //When
                        boolean isValid= phoneNumberValidator.itShouldFailWhenPhoneNumberFormatIsNotCorrect(phoneNumber);


                    //Then
                    assertThat(isValid).isTrue();
                }
                
                 @Test
                 void checkIfPhoneNoCorrectLenght(){
                    //Given
                     String phoneNumber="+4477712986355465";
                    //When
                        boolean isValid= phoneNumberValidator.itShouldFailWhenPhoneNumberFormatIsNotCorrect(phoneNumber);


                    //Then
                    assertThat(isValid).isFalse();
                }


                 @Test
                 void checkIfPhoneNoCodeCorrect(){
                    //Given
                          String phoneNumber="447771298635";
                    //When
                        boolean isValid= phoneNumberValidator.itShouldFailWhenPhoneNumberFormatIsNotCorrect(phoneNumber);


                    //Then
                    assertThat(isValid).isFalse();
                }
}
