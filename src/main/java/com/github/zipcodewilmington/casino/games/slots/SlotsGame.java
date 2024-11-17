package com.github.zipcodewilmington.casino.games.slots;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame {
    // Symbols to choose from for each reel
    public static final String[] symbols = {"🍒", "🍋", "🍊", "🍉", "⭐", "🍀"};
    private static Random random = new Random();
    private static String[] reel = new String[3];
    private static int winnings;

    public SlotsGame() {
    }

    // Method to simulate a single spin
    public static String[] spinReel() {
        for (int i = 0; i < 3; i++) {
            reel[i] = symbols[random.nextInt(symbols.length)];
        }
        return reel;
    }

    // Method to check if all symbols match (player wins)
    public static boolean checkResults(String @NotNull [] reels) {
        // Check if all symbols are the same
        return reel[0].equals(reels[1]) && reels[1].equals(reels[2]);
    }

    public static int calculatePayout() {
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

