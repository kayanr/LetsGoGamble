package com.github.zipcodewilmington.casino.games.numberguess;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessGame implements GameInterface {
    private List<PlayerInterface> players;
    private int numberToGuess;
    private int numberOfTries;
    private Random randomNumber;

    public NumberGuessGame(){
        this(10, new Random());
        this.players = new ArrayList<>();
    }

    public NumberGuessGame(int numberOfTries, Random randomNumber) {
        this.numberOfTries = numberOfTries;
        this.numberToGuess = randomNumber.nextInt(100) + 1;
        this.players = new ArrayList<>();
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public String guessNumber(int guess) {
        if (guess < numberToGuess) {
            return "Wrong guess, the number is too low!";
        }
        else if (guess > numberToGuess) {
            return "Wrong guess, the number is too high!";
        }
        else {
            return "Number guessed correctly! Congratulations";

        }

    }

    @Override
    public void add(PlayerInterface player) {
       players.add (player);
    }

    @Override
    public void remove(PlayerInterface player) {
       players.remove(player);
    }

    @Override
    public void run() {

    }
    public int getNumberOfPlayers(){
        return players.size();
    }
}