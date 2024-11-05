package swyth.cardgame.games;

import swyth.cardgame.model.IPlayer;
import swyth.cardgame.model.PlayingCard;

import java.util.List;


public class LowCardGameEvaluator implements GameEvaluator {

    @Override
    public IPlayer evaluateWinner(List<IPlayer> players) {
        IPlayer bestPlayer = null;
        int bestRank = -1;
        int bestSuit = -1;

        for (IPlayer player : players) {
            boolean newBestPlayer = false;

            if (bestPlayer == null) {
                newBestPlayer = true;
            } else {
                PlayingCard playingCard = player.getCardFromHand();
                int thisRank = playingCard.getRank().value();
                if (thisRank <= bestRank) {
                    if (thisRank < bestRank) {
                        newBestPlayer = true;
                    } else {
                        if (playingCard.getSuit().value() < bestSuit) {
                            newBestPlayer = true;
                        }
                    }
                }
            }

            if (newBestPlayer) {
                bestPlayer = player;
                PlayingCard playingCard = player.getCardFromHand();
                bestRank = playingCard.getRank().value();
                bestSuit = playingCard.getSuit().value();
            }
        }

        return bestPlayer;
    }
}
