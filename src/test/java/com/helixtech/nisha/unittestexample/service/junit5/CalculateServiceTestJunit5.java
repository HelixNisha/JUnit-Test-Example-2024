package com.helixtech.nisha.unittestexample.service.junit5;


import com.helixtech.nisha.unittestexample.service.CalculateService;
import org.junit.jupiter.api.*;

public class CalculateServiceTestJunit5 {

    // execute before all the test cases

    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After all test cases logic");
    }

    @BeforeEach
    public void eachTestCase(){
        System.out.println("Before each test cases");
    }

    @AfterEach
    public void afterEachTestCase(){
        System.out.println("After each test cases");
    }

    @Test
    @DisplayName("custom name") // Custom display name
    public void addTwoNumbersTest(){
        System.out.println("Test for addTwoNumbersTest");
        int actualResult = CalculateService.addTwoNumbers(12,12);
        int expected = 24;
        Assertions.assertEquals(expected,actualResult,"Not matched");

    }


    @Test
  //  @Disabled // to ignore this test case
    public void addAnyNumbersTest(){
        System.out.println("Test for addAnyNumbersTest");
        int result = CalculateService.sumAnyNumbers(12,1,2,3);
        int expected = 18;
        Assertions.assertEquals(expected,result);

    }

}
