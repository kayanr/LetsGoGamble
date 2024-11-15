package com.github.zipcodewilmington.casino;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class CasinoAccountManagerTest {


    @Test
    void getAccountTest1() {
        CasinoAccountManager casinoAccountManager = new CasinoAccountManager();

        CasinoAccount testAccount = casinoAccountManager.createAccount("username", "password");
        String expectedName = "username";
        String actualUserName = testAccount.getAccountName();
        Assert.assertEquals(expectedName, actualUserName);



    }

    @Test
    void createAccount() {





    }

    @Test
    void registerAccount() {
    }
}