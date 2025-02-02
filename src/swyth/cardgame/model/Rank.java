package swyth.cardgame.model;

public enum Rank {
    JOKER(0),
    TWO (2),
    THREE (3),
    FOUR (4),
    FIVE (5),
    SIX (6),
    SEVEN (7),
    EIGHT (8),
    NINE (9),
    JACK (10),
    QUEEN (11),
    KING (12),
    ACE (13);

    final int rank;

    private Rank(int value) {
        this.rank = value;
    }

    public int value() {
        return rank;
    }
}
