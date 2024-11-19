package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame implements GameInterface {
    public static final String[] symbols = {"🍒", "🍋", "🍊", "🍉", "⭐", "🍀"};
    private static Random random = new Random();
    static String[] reel;
    IOConsole io = new IOConsole();
    SlotsPlayer newPlayer;
    private int accountBalance = 1000;
    SlotsGame newGame;
    private int winnings;

    public SlotsGame() {
    }

    public static String[] spinReel() {
        reel = new String[3];
        for (int i = 0; i < 3; i++) {
            reel[i] = symbols[random.nextInt(symbols.length)];
        }
        return reel;
    }

    public static boolean checkResults(String[] reel) {
        return reel[0].equals(reel[1]) && reel[1].equals(reel[2]);
    }

    public static int calculatePayout() {
        int winnings;
        if (Arrays.equals(reel, new String[]{"🍒", "🍒", "🍒"})) {
            winnings = 10;
        } else if (Arrays.equals(reel, new String[]{"🍋", "🍋", "🍋"})) {
            winnings = 20;
        } else if (Arrays.equals(reel, new String[]{"🍊", "🍊", "🍊"})) {
            winnings = 30;
        } else if (Arrays.equals(reel, new String[]{"🍉", "🍉", "🍉"})) {
            winnings = 40;
        } else if (Arrays.equals(reel, new String[]{"⭐", "⭐", "⭐"})) {
            winnings = 50;
        } else if (Arrays.equals(reel, new String[]{"🍀", "🍀", "🍀"})) {
            winnings = 50;
        } else {
            winnings = 0;
        }
        return winnings;
    }

    @Override
    public void add(PlayerInterface player) {
        //
    }

    @Override
    public void remove(PlayerInterface player) {
        //
    }

    public int getBet() {
        IOConsole io = new IOConsole();
        int bet;
        while (true) {
            bet = io.getIntegerInput("How much would you like to wager?");
            if (!canAfford(bet)) {
                System.out.println("Not enough funds available in account! Please place a smaller bet.");
            } else {
                accountBalance -= bet;
                break;
            }
        }
        return bet;
    }

    public boolean canAfford(int bet) {
        return bet <= accountBalance;
    }

    @Override
    public void run() {
        SlotsGame newGame = new SlotsGame();
        System.out.println("Welcome to SLOTS! Will today be your lucky day?");
        getBet();
        spinReel();
        System.out.println(Arrays.toString(reel));
        if (checkResults(reel)) {
            calculatePayout();
            accountBalance += winnings;
            System.out.println("WINNER! You won " + calculatePayout() + ". Your new balance is " + accountBalance + ".");
        } else {
            System.out.println("YOU LOST! Your new balance is " + accountBalance + ".");
        } System.out.println("Would you like to play again?");
    }
}


