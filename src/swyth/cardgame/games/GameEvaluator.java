package swyth.cardgame.games;

import swyth.cardgame.model.IPlayer;

import java.util.List;

public interface GameEvaluator {
    public IPlayer evaluateWinner(List<IPlayer> winners);
}


