package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class War {

    Player playerOne;
    Player playerTwo;
    List<Card> deck = createPackOfCards();


    public War(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

    }

    public List<Card> createPackOfCards() {
        List<Card> deck = new ArrayList<>();
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck.add(new Card(ranks[j], suits[i]));
            }
        }
        Collections.shuffle(deck);
        return deck;
    }

    public List<Card> deckPartOne() {
        List<Card> deckPartOne = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            deckPartOne.add(deck.get(i));
        }
        return deckPartOne;
    }

    public ArrayList<Card> deckPartTwo() {
        ArrayList<Card> deckPartTwo = new ArrayList<>();
        for (int i = 26; i < 52; i++) {
            deckPartTwo.add(deck.get(i));
        }
        return deckPartTwo;
    }

    public String showStrongerCard(Card someCard1, Card someCard2) {

        if (someCard1.getRank().getStrong() > someCard2.getRank().getStrong()) {
            return "playerOne";
        } else if (someCard1.getRank().getStrong() < someCard2.getRank().getStrong()) {
            return "playerTwo";
        }
        {
            return "remis";
        }

    }

    public Player battle(Player somePlayer1, Player somePlayer2) {
        int pointsPlayerOne = 0;
        int pointsPlayerTwo = 0;

        while (!playerOne.getCards().isEmpty() || !playerTwo.getCards().isEmpty()) {
            String winner = showStrongerCard(somePlayer1.giveCard(somePlayer1.getCards()), somePlayer2.giveCard(somePlayer2.getCards()));
            if (winner == "playerOne") {

                somePlayer1.getCards().remove(somePlayer1.getCards().get(0));
                somePlayer2.getCards().remove(somePlayer2.getCards().get(0));
                pointsPlayerOne++;
                System.out.println("wygrał gracz 1 i ma kart: " + somePlayer1.getCards().size() + "oraz punktów: " + pointsPlayerOne);
            }
            if (winner == "playerTwo") {

                somePlayer2.getCards().remove(somePlayer2.getCards().get(0));
                somePlayer1.getCards().remove(somePlayer1.getCards().get(0));
                pointsPlayerTwo++;
                System.out.println("wygrał gracz 2 i ma kart: " + somePlayer2.getCards().size() + "oraz punktów: " + pointsPlayerTwo);
            }

            if (winner == "remis") {
                somePlayer1.getCards().remove(somePlayer1.getCards().get(0));
                somePlayer2.getCards().remove(somePlayer2.getCards().get(0));
                System.out.println("remisik");
            }
        }
        System.out.println("Czas na podsumowanie!");
        if (pointsPlayerOne < pointsPlayerTwo) {
            somePlayer2.setPoints(pointsPlayerTwo);
            return somePlayer2;
        } else if (pointsPlayerOne > pointsPlayerTwo) {
            somePlayer1.setPoints(pointsPlayerOne);
            return somePlayer1;
        }
        return null;
    }
 }
/* niekończąca się wersja
    public Player battle(Player somePlayer1, Player somePlayer2) {

        while (!playerOne.getCards().isEmpty() || !playerTwo.getCards().isEmpty()) {
            String winner = showStrongerCard(somePlayer1.giveCard(somePlayer1.getCards()), somePlayer2.giveCard(somePlayer2.getCards()));

            if (winner == "playerOne") {

                somePlayer1.getCards().add(somePlayer2.getCards().get(0));
                somePlayer1.getCards().add(somePlayer1.getCards().get(0));
                somePlayer1.getCards().remove(somePlayer1.getCards().get(0));
                somePlayer2.getCards().remove(somePlayer2.getCards().get(0));
                System.out.println("wygrał gracz 1 i ma kart: " + somePlayer1.getCards().size());
                if (somePlayer1.getCards().size() == 2) {
                    System.out.println(somePlayer1.getCards());
                }
            }
            if (winner == "playerTwo") {
                somePlayer2.getCards().add(somePlayer1.getCards().get(0));
                somePlayer2.getCards().add(somePlayer2.getCards().get(0));
                somePlayer2.getCards().remove(somePlayer2.getCards().get(0));
                somePlayer1.getCards().remove(somePlayer1.getCards().get(0));
                System.out.println("wygrał gracz 2 i ma kart: " + somePlayer2.getCards().size());
                if (somePlayer2.getCards().size() == 2) {
                    System.out.println(somePlayer1.getCards());
                }
            }
            if (winner == "remis") {
                somePlayer1.getCards().add(somePlayer1.getCards().get(0));
                somePlayer1.getCards().remove(somePlayer1.getCards().get(0));
                somePlayer2.getCards().add(somePlayer2.getCards().get(0));
                somePlayer2.getCards().remove(somePlayer2.getCards().get(0));
                System.out.println("remisik");
            }
        }
        System.out.println("A tutaj?");
        if (somePlayer1.getCards().isEmpty()) {
            return somePlayer2;
        } else if (somePlayer2.getCards().isEmpty()) {
            return somePlayer1;
        }
        System.out.println("czy tutaj doszlo?");
        return null;
    } */

