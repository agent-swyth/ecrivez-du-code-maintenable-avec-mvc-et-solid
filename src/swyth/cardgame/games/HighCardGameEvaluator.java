package swyth.cardgame.games;

import swyth.cardgame.model.Player;
import swyth.cardgame.model.PlayingCard;

import java.util.List;


public class HighCardGameEvaluator implements GameEvaluator {

    @Override
    public Player evaluateWinner(List<Player> players) {
        Player bestPlayer = null;
        int bestRank = -1;
        int bestSuit = -1;

        for (Player player : players) {
            boolean newBestPlayer = false;

            if (bestPlayer == null) {
                newBestPlayer = true;
            } else {
                PlayingCard playingCard = player.getCardFromHand();
                int thisRank = playingCard.getRank().value();
                if (thisRank >= bestRank) {
                    if (thisRank > bestRank) {
                        newBestPlayer = true;
                    } else {
                        if (playingCard.getSuit().value() > bestSuit) {
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
