package swyth.cardgame.model;

public enum Suit {
    JOKER(0), DIAMONDS (1), HEARTS (2), SPADES (3), CLUBS (4);

    private int suit;

    private Suit(int value) {
        this.suit = value;
    }

    public int value() {
        return suit;
    }
}
