package com.github.zipcodewilmington.casino.games.blackjack;

import Mechanics.Card;
import Mechanics.Deck;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BlackJackPlayerTest {

   /* BlackJackPlayer player;
    public  void setup(){

        player = new BlackJackPlayer();

    }*/

    @Test

    public void testGetHand(){

    BlackJackPlayer player = new BlackJackPlayer(null);

    Deck deck = new Deck();

    player.draw(deck.dealCard());

    assertEquals("Diamonds",player.getHand(0).toString());

    }


    @Test


    public void getNameTest(){
        BlackJackPlayer player = new BlackJackPlayer("Shaggy");
        String expected = "Shaggy";
        assertEquals(player.getName(), expected);


    }













}