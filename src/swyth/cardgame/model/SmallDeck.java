package swyth.cardgame.model;

import java.util.ArrayList;

public class SmallDeck extends Deck{
    public SmallDeck() {
        cards = new ArrayList<PlayingCard>();

        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                if (rank.value() >= 7) {
                    cards.add(new PlayingCard(rank, suit));
                    System.out.println("Creating Card [" + rank + ", " + suit + "]");
                }
            }
        }

        shuffle();
    }
}
