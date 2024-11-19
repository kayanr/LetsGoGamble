package com.github.zipcodewilmington.casino.games.blackjack;

import Mechanics.Card;
import Mechanics.Deck;
import Mechanics.Hand;

import java.util.Collection;
import java.util.List;

public class BlackJackPlayer {

    private Hand hand;


    public BlackJackPlayer(String name) {

        this.hand = new Hand();
    }

    public void draw(Deck deck) {

        hand.addCard(deck.dealCard());
        hand.addCard(deck.dealCard());
    }

    public Object getHand() {

    return hand;
    }

    public String getName() {
        return null;
    }

    public int getNumberCards() {
   return 2; }


    public int getHandTotal() {

        int total = 0;
        int numAces = 0;


        for (Card card : hand.getCards());
    return 0;}

    public void emptyHand() {
    }

    public List<Card> cardReveal() {
        List<Card> cards = hand.getCards();
        return cards;
    }

    public void dealIntitialCards(Deck deck) {

        hand.addCard(deck.dealCard());
        hand.addCard(deck.dealCard());
    }

    public void hit(Deck deck) {

        hand.addCard(deck.dealCard());

    }
}
