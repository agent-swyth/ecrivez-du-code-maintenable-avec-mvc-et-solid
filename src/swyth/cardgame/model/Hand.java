package swyth.cardgame.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<PlayingCard> cards;

    public Hand() {
        this.cards = new ArrayList<PlayingCard>();
    }

    public void addCard(PlayingCard card) {
        cards.add(card);
    }

    public PlayingCard getCard(int index) {
        return cards.get(index);
    }

    public PlayingCard removeCard(int index) {
        return cards.remove(index);
    }
}
