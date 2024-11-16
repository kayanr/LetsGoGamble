package com.github.zipcodewilmington.casino;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CasinoAccountTest {

    @Test

    public void showBalanceTest(){

        CasinoAccount account=  new CasinoAccount("I","smell");
        int expectedBalance = 1000;
        int actualBalance =account.showBalance();
        Assert.assertEquals(expectedBalance, actualBalance);

    }

    @Test
    public void getAccountNameTest(){
        CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
        CasinoAccount testAccount1 = casinoAccountManager.createAccount("username", "password");
        String expectedName = "username";
        String actualUserName = testAccount1.getAccountName();
        Assert.assertEquals(expectedName, actualUserName);
    }

    public void setAccountNameTest(){


    }

    public void setAccountPasswordTest(){

    }

    public void getAccountPasswordTest(){

    }

    public void setUserAgeTest(){

    }

    public void getUserAgeTest(){

    }


}

