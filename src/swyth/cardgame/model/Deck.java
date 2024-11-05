package swyth.cardgame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class Deck {
    protected List<PlayingCard> cards;

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
