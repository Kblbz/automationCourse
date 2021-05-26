package com.customertimes.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class RandomIntTest{

    @Test
    public void ValidateRandomNumber() {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        System.out.println("Random number: " + number);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(number >= 1 && number <= 10);
    }
}
