package swyth.cardgame;

import swyth.cardgame.controller.GameController;
import swyth.cardgame.games.HighCardGameEvaluator;
import swyth.cardgame.model.DeckFactory;
import swyth.cardgame.model.NormalDeck;
import swyth.cardgame.view.CommandLineView;
import swyth.cardgame.view.GameSwingView;

public class Games {

    public static void main(String[] args) {

        GameSwingView gameSwingView = new GameSwingView();
        gameSwingView.createAndShowGUI();

        GameController gameController = new GameController(DeckFactory.createDeck(DeckFactory.DeckType.Normal), gameSwingView, new HighCardGameEvaluator());
        gameController.run();
    }
}
