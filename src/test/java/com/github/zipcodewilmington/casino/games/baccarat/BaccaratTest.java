package com.github.zipcodewilmington.casino.games.baccarat;

import com.github.zipcodewilmington.casino.games.Baccarat.Baccarat;
import org.junit.Assert;
import org.junit.Test;

//import javax.smartcardio.Card;
import java.util.Arrays;
import java.util.List;

public class BaccaratTest {

    Baccarat baccarat = new Baccarat();
   // Card cards = new Card();
    @Test
    public void BaccaratTest() {
        // baccarat.run();
//
//         class Card {
//            int value; // The Baccarat value (0-9)
//            Card(int value) { this.value = value; }
//            int getBaccaratValue() {
//                return this.value; // Return value for simplicity
//            }
//        }
//
//        // Method to test
//        public int getTotalValue(List<Card> card) {
//            int total = 0;
//            for (Card card : cards) {
//                total += card.getBaccaratValue();
//            }
//            return total % 10;  // Baccarat values are modulo 10
//        }
//
//        @Test
//        void testTotalValueWithVariousCards() {
//            // Test with cards having values [3, 5, 8]
//            List<Card> cards = Arrays.asList(new Card(3), new Card(5), new Card(8));
//            int result = getTotalValue(cards);
//            Assert.assertEquals(6, result, "Expected total value modulo 10 to be 6");
//        }
//
//        @Test
//        void testTotalValueWithEmptyList() {
//            // Test with an empty list
//            List<Card> cards = Arrays.asList();
//            int result = getTotalValue(cards);
//            assertEquals(0, result, "Expected total value to be 0 for an empty list");
//        }
//
//        @Test
//        void testTotalValueMultipleOf10() {
//            // Test with cards having values [9, 1]
//            List<Card> cards = Arrays.asList(new Card(9), new Card(1));
//            int result = getTotalValue(cards);
//            assertEquals(0, result, "Expected total value modulo 10 to be 0");
//        }
//
//        @Test
//        void testTotalValueWithIdenticalCards() {
//            // Test with a list of cards with identical values [7, 7, 7]
//            List<Card> cards = Arrays.asList(new Card(7), new Card(7), new Card(7));
//            int result = getTotalValue(cards);
//            Assert.assertEquals(1, result, "Expected total value modulo 10 to be 1");
//        }
//
//        @Test
//        void testTotalValueWithFaceCards() {
//            // Test with face cards (value 10) [10, 10, 10]
//            List<Card> cards = Arrays.asList(new Card(10), new Card(10), new Card(10));
//            int result = getTotalValue(cards);
//            assertEquals(0, result, "Expected total value modulo 10 to be 0 for face cards");
//        }
//
//        @Test
//        void testTotalValueGreaterThan10() {
//            // Test with cards where sum is greater than 10, e.g., [5, 8, 9]
//            List<Card> cards = Arrays.asList(new Card(5), new Card(8), new Card(9));
//            int result = getTotalValue(cards);
//            assertEquals(2, result, "Expected total value modulo 10 to be 2");
//        }
//    }
//
//    }
    }
}
