package Mechanics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    Card card;

    public void setUp(){
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        card = new Card(new String[]{suits[0]}, new String[]{ranks[0]});

    }
    @Test


    public void testGetCardValueForSeven(){

    String[] suits = {"Spades"};
    String[] ranks = {"7"};

    card = new Card(suits, ranks);


    int expected = 7;

    int actual = card.getCardValue();

    Assert.assertEquals(expected, actual);





    }

    @Test

    public void testGetSuit(){

        String[] suits = {"Hearts"};
        String[] ranks = {"5"};
        card = new Card(suits,ranks);

        String expectedSuit = "Hearts";

        String actualSuit = card.getSuit();

        Assert.assertEquals(expectedSuit, actualSuit);



    }



}