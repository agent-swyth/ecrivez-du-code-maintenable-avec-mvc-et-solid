package swyth.cardgame.view;

import swyth.cardgame.controller.GameController;

import java.util.Scanner;

public class View {

    GameController controller;
    Scanner keyboard = new Scanner(System.in);

    public void setController(GameController gameController) {
        this.controller = gameController;
    }

    public void promptForPlayerName() {
        System.out.println("Please enter Player name: ");
        String playerName = keyboard.nextLine();

        if (playerName.isEmpty()) {
            controller.startGame();
        } else {
            controller.addPlayer(playerName);
        }
    }

    public void promptForFlip() {
        System.out.println("Press enter to reveal cards");
        keyboard.nextLine();
        controller.flipCards();
    }

    public void promptForNewGame() {
        System.out.println("Press enter to start a new game");
        keyboard.nextLine();
        controller.startGame();
    }

    public void showWinner(String playerName) {
        System.out.println("Winner is " + playerName + "!");
    }

    public void showPlayerName(int playerIndex, String playerName) {
        System.out.println("[" + playerIndex + "][" + playerName + "]");
    }

    public void showFaceDownCardForPlayer(int playerIndex, String playerName) {
        System.out.println("[" + playerIndex + "][" + playerName + "][x][x]");
    }

    public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit) {
        System.out.println("[" + playerIndex + "][" + playerName + "][" + rank + "][" + suit + "]");
    };

};
