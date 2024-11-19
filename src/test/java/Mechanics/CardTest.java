package Mechanics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {
    Card card;

    //public void setUp(){
//        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
//        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
      //  card = new Card(0, 0);

    //}
    @Test


    public void testGetCardValueForSeven(){

    card = new Card(6,0);

    String expected = "7";

    String actual = card.getRank();

    Assert.assertEquals(expected, actual);

    }

    @Test
    public void setrankTest() {
        card = new Card();

        card.setRank("Ace");

        Assert.assertEquals("Ace", card.getRank());

    }

    @Test
    public void setsuitTest(){
        card = new Card();
        card.setSuit("Diamonds");

        Assert.assertEquals("Diamonds", card.getSuit());

    }


    @Test

    public void testGetSuit(){

//        String[] suits = {"Hearts"};
//        String[] ranks = {"5"};
        card = new Card(1,1);

        String expectedSuit = "Hearts";

        String actualSuit = card.getSuit();

        Assert.assertEquals(expectedSuit, actualSuit);



    }



}