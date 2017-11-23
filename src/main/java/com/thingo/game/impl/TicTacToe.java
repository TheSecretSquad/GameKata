package com.thingo.game.impl;

import com.thingo.game.Game;
import com.thingo.game.GameListener;

class TicTacToe implements Game {

    private final GameListener gameListener;

    public TicTacToe(GameListener gameListener) {
        this.gameListener = gameListener;
    }

    @Override
    public Game start() {
        gameListener.started(this);
        return this;
    }

    @Override
    public Game stop() {
        gameListener.stopped(this);
        return this;
    }
}
