package swyth.cardgame;

import swyth.cardgame.controller.GameController;
import swyth.cardgame.games.HighCardGameEvaluator;
import swyth.cardgame.model.Deck;
import swyth.cardgame.view.CommandLineView;
import swyth.cardgame.view.GameSwingView;

public class Games {

    public static void main(String[] args) {

        GameSwingView gameSwingView = new GameSwingView();
        gameSwingView.createAndShowGUI();

        GameController gameController = new GameController(new Deck(), gameSwingView, new HighCardGameEvaluator());
        gameController.run();
    }
}
