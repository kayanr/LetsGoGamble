package Mechanics;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Stack;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DeckTest {
//private Deck deck;
Deck deck = new Deck();
//Card card = new Card();


@Test
public void shuffleTest(){
    // Store the order of cards before shuffling
    Stack<Card> deckBeforeShuffle = deck.initializeDeck();
    System.out.println("Deck before Shuffle : "+ deckBeforeShuffle);
    System.out.println("Deck before Shuffle : "+ deckBeforeShuffle.pop().getRank());
    // Shuffle the deck
    // Store the order of cards after shuffling
    Stack<Card> deckAfterShuffle = deck.shuffle();  //**********This Changed to.array
    System.out.println("Shuffled Deck : " + deckAfterShuffle);
    System.out.println("Shuffled Deck : " + deckAfterShuffle.pop().getRank());

    // Ensure the order of cards is different after shuffle
    Assert.assertFalse(deckBeforeShuffle.pop().getRank().equals(deckAfterShuffle.pop().getRank()));


}



@Test
    public void initializeTest(){

    Deck deck1 = new Deck();
     Stack<Card> deck = deck1.initializeDeck();

    int size = deck.size();
   // System.out.println("Deck: " + deck);
    Assert.assertEquals(52,size);

}

@Test
    public void isEmptyDeckTest(){

    Deck deck = new Deck();
    deck.initializeDeck();

    assertFalse(deck.isEmpty());

}



@Test
    public void dealCardTest(){

    Deck deck = new Deck();
    Stack<Card> cardDeck = new Stack<>();
    cardDeck = deck.initializeDeck();

    Card cardExpected = deck.dealCard();
    Card cardActual = new Card(12,3);
    Assert.assertTrue(cardExpected.toString().equals(cardActual.toString()));


}



}
