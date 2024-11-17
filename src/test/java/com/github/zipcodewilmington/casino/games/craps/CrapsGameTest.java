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


//    @Test
//    void testAddPlayer() {
//
//    }
//
//    @Test
//    void testRemovePlayer() {
//    }

    @Test
    void testPlayTurn() {

    }

    @Test
    void testCheckWin() {
       assertTrue(crapsGame.isWin());

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
        // Arrange
        CrapsGame game = new CrapsGame();
        game.setBet(50);
        game.setBalance(100);

        // Act
        boolean result = game.canAfford();

        // Assert
        assertTrue(result, "Player should afford the bet when balance is greater than or equal to the bet.");
    }

    @Test
    void testUpdateBalance() {

    }

    @Test
    void testRollDice() {
       CrapsGame game = new CrapsGame();

       int result = game.rollDice();

       assertTrue(result >= 2 && result <= 12, "Roll is between 2 and 12");

    }

    @Test
    void testRollInitialWin() {
       CrapsGame game = new CrapsGame();
       int winRoll = 2;

       game.Roll(null, winRoll);

       assertTrue(game.isWin());
    }

    @Test
    void testSetPoint() {
       CrapsGame game = new CrapsGame();
       int expectedPoint = 5;

       game.setPoint(expectedPoint);
    }

    @Test
    void testIsWin() {
       CrapsGame game = new CrapsGame();

       boolean result = game.isWin();

       assertTrue(result, "You win");
    }
}
