package com.github.zipcodewilmington.casino.games.craps;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CrapsGamePlayerTest {
    CrapsGamePlayer player;
    public  void setUp() {
        player = new CrapsGamePlayer(null);
    }
    @Test
    public void testDefaultConstructor(){
        //Given
        String expectedAccountName = " ";
        int expectedAccountBalance = 0;
        //When
        CrapsGamePlayer numGuessPlayer = new CrapsGamePlayer();
        //Then
        String actualAccountName = numGuessPlayer.getAccountName();
        int actualAccountBalance = numGuessPlayer.getAccountBalance();
        assertEquals(expectedAccountName, actualAccountName);
        assertEquals(expectedAccountBalance, actualAccountBalance);
    }
    @Test
    public void testDefaultConstructorWithNameAndBalance(){
        //Given
        String expectedAccountName = "Susan";
        int expectedAccountBalance = 100;
        //When
        CrapsGamePlayer numGuessPlayer = new CrapsGamePlayer("Susan", 100);
        //Then
        String actualAccountName = numGuessPlayer.getAccountName();
        int actualAccountBalance = numGuessPlayer.getAccountBalance();
        assertEquals(expectedAccountName, actualAccountName);
        assertEquals(expectedAccountBalance, actualAccountBalance);
    }
    @Test
    public void testSetAccountName(){
        //Given
        CrapsGamePlayer numGuessPlayer = new CrapsGamePlayer();
        String expectedAccountName = "Sandra";
        //int expectedAccountBalance = 0;
        //When
        numGuessPlayer.setAccountName(expectedAccountName);
        //Then
        String actualAccountName = numGuessPlayer.getAccountName();
        //int actualAccountBalance = numGuessPlayer.getAccountBalance();
        assertEquals(expectedAccountName, actualAccountName);
        //assertEquals(expectedAccountBalance, actualAccountBalance);
    }
    @Test
    public void testSetAccountBalance(){
        //Given
        CrapsGamePlayer numGuessPlayer = new CrapsGamePlayer();
        int expectedAccountBalance = 210;
        //When
        numGuessPlayer.setAccountBalance(expectedAccountBalance);
        //Then
        int actualAccountBalance = numGuessPlayer.getAccountBalance();
        assertEquals(expectedAccountBalance, actualAccountBalance);
    }
}