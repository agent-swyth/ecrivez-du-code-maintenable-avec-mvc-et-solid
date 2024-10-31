package swyth.cardgame.model;

public class DeckFactory {
    public enum DeckType {
        Normal, Small, Test
    }

    public static Deck createDeck(DeckType type) {
        return switch (type) {
            case Normal -> new NormalDeck();
            case Small -> new SmallDeck();
            case Test -> new TestDeck();
        };
    }

}
