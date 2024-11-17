package Mechanics;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cards;


    public Hand() {
        this.cards = new ArrayList<>();
    }

    // Add a card to the hand
    public void addCard(Card card) {
       cards.add(card);
    }


    // Get the cards in hand
    public List<Card> getCards() {
        return cards;
    }

    // Clear the hand
    public void clear() {
        cards.clear();
    }

    @Override
    public String toString() {
        return cards.toString();
    }


    public boolean isEmpty() {

        return cards.isEmpty();

    }
}
