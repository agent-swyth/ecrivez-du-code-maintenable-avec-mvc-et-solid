package swyth.cardgame.model;

public interface IPlayer {
    public void addCardToHand(PlayingCard card);

    public PlayingCard getCardFromHand();

    public PlayingCard removeCardFromHand();

    public String getName();
}
