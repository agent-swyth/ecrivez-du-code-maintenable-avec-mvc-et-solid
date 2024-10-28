package swyth.cardgame.controller;

import swyth.cardgame.games.GameEvaluator;
import swyth.cardgame.model.Deck;
import swyth.cardgame.model.Player;
import swyth.cardgame.model.PlayingCard;
import swyth.cardgame.view.GameViewable;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    enum GameState {
        AddingPLayers, CardsDealt, WinnerRevealed
    }

    Deck deck;
    List<Player> players;
    Player winner;
    GameViewable view;

    GameState gameState;
    GameEvaluator gameEvaluator;

    public GameController(Deck deck, GameViewable view, GameEvaluator gameEvaluator) {
        this.view = view;
        this.deck = deck;
        players = new ArrayList<>();
        this.gameState = GameState.AddingPLayers;
        view.setController(this);
        this.gameEvaluator = gameEvaluator;
    }

    public void run() {
        while(gameState == GameState.AddingPLayers) {
            view.promptForPlayerName();
        }

        switch(gameState) {
            case CardsDealt:
                view.promptForFlip();
                break;
            case WinnerRevealed:
                view.promptForNewGame();
                break;
        }
    }

    public void addPlayer(String playerName) {
        if (gameState == GameState.AddingPLayers) {
            players.add(new Player(playerName));
            view.showPlayerName(players.size(), playerName);
        }
    }

    public void startGame() {
        if (gameState != GameState.CardsDealt) {
            deck.shuffle();
            int playerIndex = 1;
            for (Player player : players) {
                player.addCardToHand(deck.removeTopCard());
                view.showFaceDownCardForPlayer(playerIndex++, player.getName());
            }
            gameState = GameState.CardsDealt;
        }
        this.run();
    }

    public void flipCards() {
        int playerIndex = 1;
        for (Player player : players) {
            PlayingCard playingCard = player.getCardFromHand();
            playingCard.flip();
            view.showCardForPlayer(playerIndex++, player.getName(), playingCard.getRank().toString(), playingCard.getSuit().toString());
        }

        evaluateWinner();
        displayWinner();
        rebuildDeck();
        gameState = GameState.WinnerRevealed;
        this.run();
    }

    void evaluateWinner() {
        winner = gameEvaluator.evaluateWinner(players);
    }

    void displayWinner() {
        view.showWinner(winner.getName());
    }

    void rebuildDeck() {
        for (Player player : players) {
            deck.returnCardToDeck(player.removeCardFromHand());
        }
    }

    void exitGame() {
        System.exit(0);
    }

    public void nextAction(String nextChoice) {
        if ("+q".equals(nextChoice)) {
            exitGame();
        } else {
            startGame();
        }
    }
}
