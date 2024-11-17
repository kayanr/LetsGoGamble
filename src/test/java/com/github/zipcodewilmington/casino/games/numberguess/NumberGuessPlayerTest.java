package com.github.zipcodewilmington.casino.games.numberguess;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberGuessPlayerTest {

    @Test
    public void testDefaultConstructor(){

        //Given
        String expectedAccountName = " ";
        int expectedAccountBalance = 0;

        //When
        NumberGuessPlayer numGuessPlayer = new NumberGuessPlayer();

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
        NumberGuessPlayer numGuessPlayer = new NumberGuessPlayer("Susan", 100);

        //Then
        String actualAccountName = numGuessPlayer.getAccountName();
        int actualAccountBalance = numGuessPlayer.getAccountBalance();

        assertEquals(expectedAccountName, actualAccountName);
        assertEquals(expectedAccountBalance, actualAccountBalance);

    }

@Test
public void testSetAccountName(){

    //Given
    NumberGuessPlayer numGuessPlayer = new NumberGuessPlayer();
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
        NumberGuessPlayer numGuessPlayer = new NumberGuessPlayer();
        int expectedAccountBalance = 210;

        //When
        numGuessPlayer.setAccountBalance(expectedAccountBalance);

        //Then
        int actualAccountBalance = numGuessPlayer.getAccountBalance();

        assertEquals(expectedAccountBalance, actualAccountBalance);

    }

}