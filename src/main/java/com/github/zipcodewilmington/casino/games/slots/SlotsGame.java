package com.github.zipcodewilmington.casino.games.slots;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame {
    // Symbols to choose from for each reel
    public static final String[] symbols = {"🍒", "🍋", "🍊", "🍉", "⭐", "🍀"};
    private static Random random = new Random();
    static String[] reel;

    public SlotsGame() {
    }

    // Method to simulate a single spin
    public static String[] spinReel() {
        String[] reel = new String[3];
        for (int i = 0; i < 3; i++) {
            reel[i] = symbols[random.nextInt(symbols.length)];
        }
        return reel;
    }

    // Method to check if all symbols match (player wins)
    public static boolean checkResults(String[] reels) {
        // Check if all symbols are the same
        return reel[0].equals(reels[1]) && reels[1].equals(reels[2]);
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
}

