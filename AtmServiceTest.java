package com.devskiller.tests;

import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

public class AtmServiceTest {
	

    private AtmService atmService;

    @Before
    public void setUp() {
	atmService = AtmServiceProvider.getAtmService();
    }

    @Test
    public void isAmountGraterthenZero() {
    	 Assert.assertEquals("Amount should be greater than zero",atmService.withdraw("", -1));
    }
    
    @Test
    public void isAmountMultipleOfTens() {
    	 Assert.assertEquals("Amount should be the multiple of the 10 USD",atmService.withdraw("abc", 89));
    }
   
    @Test
    public void areFundsSufficient() {
    atmService.deposit("", 500);
   	 Assert.assertEquals("Insufficient funds",atmService.withdraw("xyz", 600));
    }
    
    @Test
    public void doesSuccessMethodShowRightRemainingBalance(){ 
    int initialBalance = 500;
    int withdrawBalance = 200;
    int remainingBalance = initialBalance - withdrawBalance;
     atmService.deposit("", initialBalance);
   	 Assert.assertEquals("Success! Amount left: " + remainingBalance + " USD", atmService.withdraw("",withdrawBalance));
   }
}