package com.github.zipcodewilmington.casino.games.slots;

import static org.junit.jupiter.api.Assertions.*;

import com.github.zipcodewilmington.casino.games.slots.SlotsGame;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class SlotsGameTest {
    SlotsGame slotsgame;

    @Test
    public void testForSymbols () {
        // Spin the reels
        String[] reels = SlotsGame.spinReel();

        // Ensure that each symbol is valid (exists in SYMBOLS array)
        for (String symbol : reels) {
            assertTrue(Arrays.asList(SlotsGame.symbols).contains(symbol), "Invalid symbol: " + symbol);
        }
    }

    @Test
    public void testRandomReels () {
        // Spin the reels multiple times and ensure the results are not the same
        String[] firstSpin = SlotsGame.spinReel();
        String[] secondSpin = SlotsGame.spinReel();

        // Ensure the two spins are different
        assertFalse(Arrays.equals(firstSpin, secondSpin), "The two spins should be different.");
    }
}
