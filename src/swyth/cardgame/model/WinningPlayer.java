package swyth.cardgame.model;

public class WinningPlayer implements IPlayer {
    IPlayer winner;

    public WinningPlayer(IPlayer player) {
        this.winner = player;
    }

    @Override
    public void addCardToHand(PlayingCard card) {
        winner.addCardToHand(card);
    }

    @Override
    public PlayingCard getCardFromHand() {
        return winner.getCardFromHand();
    }

    @Override
    public PlayingCard removeCardFromHand() {
        return winner.removeCardFromHand();
    }

    @Override
    public String getName() {
        return "******" + winner.getName() + "******";
    }
}
