package cards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Card {

    private Suit suit;
    private Rank rank;



    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Card() {
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int showStrong() {
        return rank.getStrong();
    }



    public ArrayList<Card> createPackOfCardsOnlyBlack() {
        ArrayList <Card> cards = new ArrayList<>();
        Rank[] rank = Rank.values();
        for (int i = 0; i < rank.length; i++) {
            cards.add(new Card(rank[i], Suit.black));
        }
        return cards;
    }






    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}
