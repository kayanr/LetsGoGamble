package Mechanics;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HandTest {

    private Hand hand;
    private Card card1;
    private Card card2;



    public void setUp(){

        hand = new Hand();
        card1 = new Card(new String[]{"Spades"}, new String[]{"Ace"});
        card2 = new Card(new String[]{"Hearts"}, new String[]{"King"});



    }

    @Test

    public void testEmptyHand(){

        Assert.assertEquals(true, hand.isEmpty());

    }


}