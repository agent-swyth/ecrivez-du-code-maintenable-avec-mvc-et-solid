package swyth.cardgame;

import swyth.cardgame.controller.GameController;
import swyth.cardgame.games.HighCardGameEvaluator;
import swyth.cardgame.model.Deck;
import swyth.cardgame.view.CommandLineView;

public class Games {

    public static void main(String[] args) {
        GameController gameController = new GameController(new Deck(), new CommandLineView(), new HighCardGameEvaluator());
        gameController.run();
    }
}
