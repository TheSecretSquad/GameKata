package com.thingo.game.impl;

import com.thingo.game.Game;
import com.thingo.game.GameListener;

class TicTacToe implements Game {

    private final GameListener gameListener;
    private boolean started;

    public TicTacToe(GameListener gameListener) {
        this.gameListener = gameListener;
        this.started = false;
    }

    @Override
    public Game start() {
        if (isStarted()) {
            throw new RuntimeException("Game is already started.");
        }
        startGame();
        return this;
    }

    private void startGame() {
        started = true;
        gameListener.started(this);
    }

    private boolean isStarted() {
        return started;
    }

    @Override
    public Game stop() {
        if (isStopped()) {
            throw new RuntimeException("Game is already stopped.");
        }
        stopGame();
        return this;
    }

    private void stopGame() {
        started = false;
        gameListener.stopped(this);
    }

    private boolean isStopped() {
        return !isStarted();
    }
}
