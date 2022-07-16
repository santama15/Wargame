package cards;

import com.sun.jdi.request.MethodEntryRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {

    final private String name;
    private List<Card> cards;
    private int points = 0;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }

    public Card giveCard(List<Card> someCards) {
        Card card = someCards.get(0);
        return card;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", cards=" + cards +
                '}';
    }
}
