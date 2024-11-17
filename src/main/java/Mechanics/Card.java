package Mechanics;

public class Card {
//static int[] deck = new int[52];

//Declaring array of card suit and ranks.
   private static final String[] Suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
   private static final String[] Ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


    //creating integer type fields to access individual suits and rank to create deck of cards.
    String rank;
    String suit;

    //Nullary Constructor
public Card(){
    this.rank = null;
    this.suit = null;

}

//Constructor with value initialization.
    public Card(int rank, int suit) {
        this.rank = Ranks[rank];
        this.suit = Suits[suit];
    }


    //Getter
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}
