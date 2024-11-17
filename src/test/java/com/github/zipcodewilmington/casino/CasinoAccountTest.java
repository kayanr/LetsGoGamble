package com.github.zipcodewilmington.casino;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CasinoAccountTest {

    @Test

    public void showBalanceTest(){

        CasinoAccount account=  new CasinoAccount("I","smell");

        int expectedBalance = 100;
        int actualBalance =account.showBalance();

        Assert.assertEquals(expectedBalance, actualBalance);



    }




    }

