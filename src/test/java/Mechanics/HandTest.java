package Mechanics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HandTest {

    private Hand hand = new Hand();
    private Card card1;
    private Card card2;



    public void setUp(){

        hand = new Hand();
        card1 = new Card(0,0);
        card2 = new Card(1,12);



    }


    @Test
    public void addCardToHandTest(){
        hand.addCard(card1);

        Assert.assertFalse(hand.isEmpty());


    }


    @Test
    public void getCardsTest(){

        hand.addCard(card2);

        Assert.assertFalse(hand.getCards().isEmpty());

    }


    @Test

    public void testEmptyHand(){
        hand.clear();
        Assert.assertTrue(hand.isEmpty());

    }


}