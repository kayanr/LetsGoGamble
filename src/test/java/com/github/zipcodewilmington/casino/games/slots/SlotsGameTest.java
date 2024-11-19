package com.github.zipcodewilmington.casino.games.slots;
import static org.junit.jupiter.api.Assertions.*;
import com.github.zipcodewilmington.casino.games.slots.SlotsGame;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Date;
public class SlotsGameTest {
    SlotsGame slotsgame = new SlotsGame();
    @Test
    public void testForSymbols () {
        String[] reels = SlotsGame.spinReel();

        for (String symbol : reels) {
            assertTrue(Arrays.asList(SlotsGame.symbols).contains(symbol), "Slots are jammed! Please try again later.");
        }
    }
    @Test
    public void testRandomReels () {
        // Spin the reels multiple times and ensure the results are not the same
        String[] firstSpin = SlotsGame.spinReel();
        String[] secondSpin = SlotsGame.spinReel();
        // Ensure the two spins are different
        assertEquals(Arrays.equals(firstSpin, secondSpin), false, "The two spins should be different.");
    }
    @Test
    public void testPayout1 () {
        // given
        SlotsGame.reel = new String[]{"🍒", "🍒", "🍒"};
        int expectedWinnings = 10;
        int winnings = SlotsGame.calculatePayout();
        assertEquals(10, winnings);
    }

    @Test
    public void testPayout2 () {
        // given
        SlotsGame.reel = new String[]{"🍀", "🍀", "🍀"};
        int expectedWinnings = 50;
        int winnings = SlotsGame.calculatePayout();
        assertEquals(50, winnings);
    }
}