package Mechanics;

import java.util.*;

//import static Mechanics.Card.deck;


public class Deck{
    // Array for original deck of cards
    private Stack<Card> deck = new Stack<>();


    // Initialize deck with 52 cards
    public Stack<Card> initializeDeck() {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                cards[index++] = new Card(rank, suit);
            }
        }
        List<Card> cardList = Arrays.asList(cards);
        for (int i = 0; i < cardList.size(); i++) {
            Card card = cardList.get(i);
            deck.push(card);
        }
        return deck;
    }

    // Shuffle the deck and push cards onto the stack
    //public void shuffle() {
    public Stack<Card> shuffle() {  //*******Return type of class changed from array to stack

        Collections.shuffle(deck);

        return deck;
    }

    // Dealer can remove/pop a card from deck if it's not empty.
    public Card dealCard() {
        if (deck.isEmpty()) {
            return null;
        }
        return deck.pop();
    }



    // Check if the deck is empty
    public boolean isEmpty() {
        return deck.isEmpty();
    }

}
