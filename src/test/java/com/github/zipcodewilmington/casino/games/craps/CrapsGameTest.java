package com.github.zipcodewilmington.casino.games.craps;


import com.github.zipcodewilmington.casino.PlayerInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CrapsGameTest {
        private CrapsGame crapsGame;


   @BeforeEach
   void setUp(){
       crapsGame = new CrapsGame();

   }


    @Test
    void testAddPlayer() {


    }

    @Test
    void testRemovePlayer() {
    }

    @Test
    void testPlayTurn() {

    }

    @Test
    void testCheckWin() {

    }

    @Test
    void testIsGameOver() {
        assertFalse(crapsGame.isGameOver(), "Game should not be over initially.");
    }

    @Test
    void testGetRandom() {
        for (int i = 0; i < 100; i++) {
            int random = crapsGame.getRandom();
            assertTrue(random >= 1 && random <= 6, "Random dice roll should be between 1 and 6.");
        }
    }

    @Test
    void testGetBet() {
        int bet = crapsGame.getBet();
        assertEquals(0, bet, "Initial bet should be 0.");
    }

    @Test
    void testCanAfford() {

    }

    @Test
    void testUpdateBalance() {

    }

    @Test
    void testRollDice() {

    }

    @Test
    void testRollInitialWin() {
    }

    @Test
    void testSetPoint() {
    }

    @Test
    void testIsWin() {
    }
}
