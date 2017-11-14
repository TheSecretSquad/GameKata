package com.thingo.game.impl;

import com.thingo.game.Game;

public class TicTacToe implements Game {

    private final Players players;

    public TicTacToe(Players players) {
        this.players = players;
    }
    
    @Override
    public Game start() {
        players.start();
        return this;
    }
}
