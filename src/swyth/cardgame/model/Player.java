package swyth.cardgame.model;

public class Player implements IPlayer {
    private final String name;
    private final Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public void addCardToHand(PlayingCard card) {
        hand.addCard(card);
    }

    public PlayingCard getCardFromHand() {
        return hand.getCard(0);
    }

    public PlayingCard removeCardFromHand() {
        return hand.removeCard(0);
    }

    public String getName() {
        return name;
    }
}
