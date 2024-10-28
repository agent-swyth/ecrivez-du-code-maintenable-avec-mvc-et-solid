package swyth.cardgame.view;

import swyth.cardgame.controller.GameController;

public interface GameViewable {

    public void setController(GameController gameController);

    public void promptForPlayerName();

    public void promptForFlip();

    public void promptForNewGame();

    public void showWinner(String playerName);

    public void showPlayerName(int playerIndex, String playerName);

    public void showFaceDownCardForPlayer(int playerIndex, String playerName);

    public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit);
}