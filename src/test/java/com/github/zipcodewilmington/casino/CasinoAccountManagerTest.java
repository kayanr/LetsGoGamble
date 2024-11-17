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
        CasinoAccount casinoAccount = casinoAccountManager.getAccount("accountName", "accountPassword");
       // CasinoAccount testAccount1 = casinoAccountManager.createAccount("username", "password");
        String expectedName = "username";
        String actualUserName = casinoAccount.getAccountName();
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
        CasinoAccount testAccount3 = new CasinoAccount("sam", "theman");
        System.out.println(testAccount3.getAccountName());
    }

    @Test
    void registerAccount() {
    }
}