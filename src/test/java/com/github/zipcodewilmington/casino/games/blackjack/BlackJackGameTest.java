package com.github.zipcodewilmington.casino.games.blackjack;

import Mechanics.Card;
import Mechanics.Deck;
import Mechanics.Hand;
import org.junit.Assert;
import org.junit.Test;

import java.net.Inet4Address;

import static org.junit.jupiter.api.Assertions.*;



public class BlackJackGameTest {
  private Deck deck;
  private BlackJackPlayer player;
    private String Hand;

    @Test


    public void dealTest(){

    player = new BlackJackPlayer(null);


    deck = new Deck();

    Integer actual = player.getHandTotal().size();

    Assert.assertNotNull("Hand should not be null",actual);
    assertTrue(actual >= 4 && actual <= 21, "Hand total should be between 4 and 21");
    
}


@Test 
    
    public void playerBlackjackTest(){
    
    player = new BlackJackPlayer(null);
    deck = new Deck();
    
    player.dealIntitialCards(deck);

    assertEquals("Player should have a blackjack",21, Hand);
    

}

@Test

public void playerHitTest(){

        player = new BlackJackPlayer(null);
        deck = new Deck();

        player.dealIntitialCards(deck);
        int handSizeBefore = player.getHandTotal().size();

        player.hit(deck);

        int handSizeAfter = player.getHandTotal().size();

        assertEquals("Hand size should increase by 1 after player hits", handSizeBefore +1);

}


}