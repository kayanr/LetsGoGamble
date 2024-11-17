package com.github.zipcodewilmington.casino.games.numberguess;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class MockRandomNumGenerator extends Random{
    private int num;

    public MockRandomNumGenerator(int num){
        this.num = num;
    }

    @Override
    public int nextInt(int bound){
        return num - 1;
    }
}
public class NumberGuessGameTest {
private static final Logger LOGGER = Logger.getLogger(NumberGuessGameTest.class.getName());
    @Test
    public void testDefaultConstructor(){
        //Given
        int expectedNumberOfTries = 10;

        //When
        NumberGuessGame numGame = new NumberGuessGame();

        //Then
        int actualNumberOfTries = numGame.getNumberOfTries();

        Assert.assertEquals(expectedNumberOfTries, actualNumberOfTries);

    }

    @Test
    public void testConstructorWithNumberAndTries(){
        //Given
        //int numberToGuess =75;

        //Random randomNum = new Random(12345);
        MockRandomNumGenerator testRandom = new MockRandomNumGenerator(50);
        int expectedNumberOfTries = 10;

        //When
        NumberGuessGame numGame = new NumberGuessGame(expectedNumberOfTries, testRandom);

        //Then
        int expectedNumberToGuess = 50;

        LOGGER.info("Expected number guessed to be: "+ expectedNumberToGuess);
        LOGGER.info("Actual number guessed: "+ numGame.getNumberToGuess());

        assertEquals(expectedNumberToGuess, numGame.getNumberToGuess());
        assertEquals(expectedNumberOfTries, numGame.getNumberOfTries());

    }

    @Test
    public void testNumberGameGuessTooLow(){
        MockRandomNumGenerator testRandom = new MockRandomNumGenerator(60);
        NumberGuessGame myGame = new NumberGuessGame(10, testRandom);
        String outCome = myGame.guessNumber(16);
        assertEquals("Wrong guess, the number is too low!", outCome);
    }

}