package swyth.cardgame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NormalDeck extends Deck {
    public NormalDeck() {
        cards = new ArrayList<PlayingCard>();

        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new PlayingCard(rank, suit));
                System.out.println("Creating Card [" + rank + ", " + suit + "]");
            }
        }

        shuffle();
    }
}
