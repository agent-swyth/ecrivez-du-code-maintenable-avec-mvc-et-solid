package swyth.cardgame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private final ArrayList<PlayingCard> cards;

    public Deck() {
        this.cards = new ArrayList<PlayingCard>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new PlayingCard(rank, suit));
                System.out.println("Creating Card [" + rank + ", " + suit + "]");
            }
        }

        shuffle();
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < cards.size(); i++) {
            Collections.swap(cards, i, rand.nextInt(cards.size()));
        }
    }

    public PlayingCard removeTopCard() {
        return cards.removeFirst();
    }

    public void returnCardToDeck(PlayingCard card) {
        cards.add(card);
    }

    public List<PlayingCard> getCards() {
        return cards;
    }
}
