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
        CasinoAccount testAccount1 = casinoAccountManager.createAccount("username", "password");
        String expectedName = "username";
        String actualUserName = testAccount1.getAccountName();
        Assert.assertEquals(expectedName, actualUserName);

    }

    @Test
    void getAccountTest2() {
        CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
        CasinoAccount testAccount2 = casinoAccountManager.createAccount("deepti", "rocks");
        String expectedName = "deepti";
        String actualUserName = testAccount2.getAccountName();
        Assert.assertEquals(expectedName, actualUserName);
    }


    @Test
    void createAccount() {
        CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
        CasinoAccount testAccount2 = casinoAccountManager.createAccount("deepti", "rocks");
        String expectedName = "deepti";
        String actualUserName = testAccount2.getAccountName();
        Assert.assertEquals(expectedName, actualUserName);
    }

    @Test
    void registerAccount() {

    }
}