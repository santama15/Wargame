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

        War warGame = new War(playerOne, playerTwo);

        warGame.playerOne.setCards(warGame.deckPartOne());
        warGame.playerTwo.setCards(warGame.deckPartTwo());

        Player winner = warGame.battle(playerOne, playerTwo);

        System.out.println("Wygrywa " + winner.getName() + " z wynikiem: " + winner.getPoints());

    }
}
