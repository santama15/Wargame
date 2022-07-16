package cards;

import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DemoCard {

    public static void main(String[] args) {

        Card War = new Card();
        War.setRank(Rank.dama);
        War.setSuit(Suit.purple);

        Card card2 = new Card();
        card2.setRank(Rank.jopek);
        card2.setSuit(Suit.black);

        // beginning the game War
        Player playerOne = new Player("Piotr");
        Player playerTwo = new Player("Adam");

        War wargame = new War(playerOne, playerTwo);

        wargame.playerOne.setCards(wargame.deckPartOne());
        wargame.playerTwo.setCards(wargame.deckPartTwo());

        Player winner = wargame.battle(playerOne, playerTwo);

        System.out.println("Wygrywa " + winner.getName() + " z wynikiem: " + winner.getPoints());

    }
}
