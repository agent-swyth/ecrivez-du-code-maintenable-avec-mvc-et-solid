package swyth.cardgame;

import swyth.cardgame.controller.GameController;
import swyth.cardgame.games.HighCardGameEvaluator;
import swyth.cardgame.model.Deck;
import swyth.cardgame.view.View;

public class Games {

    public static void main(String[] args) {
        GameController gameController = new GameController(new Deck(), new View(), new HighCardGameEvaluator());
        gameController.run();
    }
}
