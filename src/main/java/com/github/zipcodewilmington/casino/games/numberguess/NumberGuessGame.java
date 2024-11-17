package com.github.zipcodewilmington.casino.games.numberguess;

import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessGame {
   // private List<PlayerInterface> players = new ArrayList<>();
    private int numberToGuess;
    private int numberOfTries;
    private Random randomNumber;

    public NumberGuessGame(){
        this(10, new Random());
    }

    public NumberGuessGame(int numberOfTries, Random randomNumber) {
        this.numberOfTries = numberOfTries;
        this.numberToGuess = randomNumber.nextInt(100) + 1;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }
}