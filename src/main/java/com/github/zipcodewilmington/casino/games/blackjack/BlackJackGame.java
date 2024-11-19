package com.github.zipcodewilmington.casino.games.blackjack;

import Mechanics.Deck;

public class BlackJackGame {

    private BlackJackPlayer player;
    private Deck deck;



    public BlackJackGame(){
        this.deck = new Deck();
        this.player = new BlackJackPlayer(null);


    }

    public void run() {
        this.printRules();
        this.play();
    }


    private void play() {

    }

    private void printRules() {
    }



}
