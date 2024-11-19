package com.github.zipcodewilmington.casino.games.Baccarat;

import Mechanics.Card;
import Mechanics.Deck;
import Mechanics.Hand;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Baccarat implements GameInterface, PlayerInterface {
    private Hand playerHand;
    private Hand bankerHand;
    private Deck deck;
    private Integer accountBalance = 3000;

    //Constructor
    public Baccarat(Hand playerHand, Hand bankerHand, Deck deck) {
        this.playerHand = playerHand;
        this.bankerHand = bankerHand;
        this.deck = deck;
    }

    // Nullary Constructor
    public Baccarat() {
        this.playerHand = new Hand();
        this.bankerHand = new Hand();
        this.deck = new Deck();
    }


    @Override
    public <SomeReturnType> SomeReturnType play() {
        String input ="";
       do {
           deck.initializeDeck();
           deck.shuffle();
           // Clear the hands
           playerHand.clear();
           bankerHand.clear();
           this.getBet();
           // Deal two cards to both player and banker
           dealInitialCards();

           // Check if a third card is needed for either player or banker
           if (shouldDrawThirdCard(playerHand)) {
               playerHand.addCard(deck.dealCard());
           }

           if (shouldDrawThirdCard(bankerHand)) {
               bankerHand.addCard(deck.dealCard());
           }

           // Determine the winner
           determineWinner();

          System.out.println("\nDo you wish to play Again...??");
           Scanner scan = new Scanner(System.in);
          System.out.println("Yes / No");
           input= scan.nextLine();

       }while(input.equals("Yes"));
        return null;
    }

    // Deal two cards to both the player and the banker
    private void dealInitialCards() {
        playerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());
        bankerHand.addCard(deck.dealCard());
        bankerHand.addCard(deck.dealCard());
    }

    // Get the value of the card for Baccarat (face cards are worth 10 or 0, Ace is 1, 2-9 are face value)
    public int getBaccaratValue(Card card) {
        if (card.getRank().equals("Jack") || card.getRank().equals("Queen") || card.getRank().equals("King") || card.getRank().equals("10")) {
            return 0;
        } else if (card.getRank().equals("Ace")) {
            return 1;
        } else {
            return Integer.parseInt(card.getRank());
        }
    }

    // Get the total value of the hand (modulo 10 for Baccarat)
    public int getTotalValue(List<Card> cards) {
        int total = 0;
        for (Card card : cards) {
            total += getBaccaratValue(card);
        }
        return total % 10;  // Baccarat values are modulo 10
    }

    // Check if a third card should be drawn according to Baccarat rules
    private boolean shouldDrawThirdCard(Hand hand) {
        int totalValue = getTotalValue(hand.getCards());
        if (hand == playerHand) {
            return totalValue <= 5;  // Player draws if total value is 5 or less
        } else {
            return totalValue <= 5;  // Banker draws if total value is 5 or less
        }
    }

    // Determine the winner based on the hand values
    private void determineWinner() {
        int playerTotal = getTotalValue(playerHand.getCards());
        int bankerTotal = getTotalValue(bankerHand.getCards());

        System.out.println("\nPlayer Hand: " + playerHand + " Total: " + playerTotal);
        System.out.println("Dealer Hand: " + bankerHand + " Total: " + bankerTotal);

        if (playerTotal > bankerTotal) {
            System.out.println("\n******* PLAYER WINS!!!!*******");
        } else if (bankerTotal > playerTotal) {
            System.out.println("\n******* DEALER WINS!!!!********");
        } else {
            System.out.println("\n********IT'S A TIE!!!!*********");
        }
    }

    public int getBet() {
        IOConsole io = new IOConsole();
        int bet;
        while (true) {
           // bet = 200;
            bet = io.getIntegerInput("PLACE YOUR BET...?");
            if (!canAfford(bet)) {
                System.out.println("YOU DO NOT HAVE ENOUGH MONEY TO PLAY");
            } else {
                accountBalance -= bet;
                break;
            }
        }
        return bet;
    }

    public boolean canAfford(int bet) {
        return bet <= accountBalance;
    }

    // Print the rules of the game
    public void printRules() {
        System.out.println("Baccarat Rules:");
        System.out.println("1. The Player and Dealer are each dealt two cards.");
        System.out.println("2. A third card may be drawn depending on the value of the first two cards.");
        System.out.println("3. Cards 2 through 9 are worth their face value.");
        System.out.println("4. 10, J, Q, and K are worth 0 points.");
        System.out.println("5. The Ace is worth 1 point.");
        System.out.println("6. The hand with the total closest to 9 wins.");
        System.out.println("7. If both hands are tied, it is a draw.\n\n");
    }


    @Override
public void add(PlayerInterface player) {

}

@Override
public void remove(PlayerInterface player) {

}

@Override
public void run() {
    this.printRules();

    this.play();
}

@Override
public CasinoAccount getArcadeAccount() {
    return null;
}


}
