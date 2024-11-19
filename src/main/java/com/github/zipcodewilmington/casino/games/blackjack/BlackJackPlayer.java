package com.github.zipcodewilmington.casino.games.blackjack;

import Mechanics.Card;
import Mechanics.Deck;
import Mechanics.Hand;

public class BlackJackPlayer {

    private Hand hand;


    public BlackJackPlayer(String name) {

        this.hand = new Hand();
    }

    public void draw(Deck deck) {

        hand.addCard(deck.dealCard());
        hand.addCard(deck.dealCard());
    }

    public Object getHand(int i) {

    return i;
    }

    public String getName() {
        return null;
    }

    public int getNumberCards() {
   return 2; }

    public void cardReveal(boolean b) {
    }

    public int getHandTotal() {
   return 1; }

    public void emptyHand() {
    }

    public void dealIntitialCards(Deck deck) {
    }

    public void hit(Deck deck) {
    }
}
