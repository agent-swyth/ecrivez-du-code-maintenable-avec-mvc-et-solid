package swyth.cardgame.games;

import swyth.cardgame.controller.GameController;
import swyth.cardgame.model.Deck;
import swyth.cardgame.view.View;

public class Games {

    public static void main(String[] args) {
        GameController gameController = new GameController(new Deck(), new View());
        gameController.run();
    }
}
