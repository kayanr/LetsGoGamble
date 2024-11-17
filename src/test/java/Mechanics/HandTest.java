package Mechanics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HandTest {

    private Hand hand = new Hand();
    Card card1 = new Card(0,0);
    Card card2 = new Card(3,3);


    public void setUp(){

        hand = new Hand();

    }


    @Test
    public void addCardToHandTest(){
        hand.addCard(card1);

        Assert.assertFalse(hand.isEmpty());


    }


    @Test
    public void getCardsTest(){

        hand.addCard(card2);

        Card expectedCardinHand = new Card(3,3);

      Assert.assertTrue(expectedCardinHand.toString().equals(hand.getCards().get(0).toString()));

    }


    @Test

    public void testEmptyHand(){
        hand.clear();
        Assert.assertTrue(hand.isEmpty());

    }


}