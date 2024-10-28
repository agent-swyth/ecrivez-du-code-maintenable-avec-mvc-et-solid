package swyth.cardgame.games;

import swyth.cardgame.model.Player;

import java.util.List;

public interface GameEvaluator {
    public Player evaluateWinner(List<Player> winners);
}


