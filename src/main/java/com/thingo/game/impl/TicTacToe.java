package com.thingo.game.impl;

import com.thingo.game.Game;
import com.thingo.game.GameListener;

class TicTacToe implements Game {

    private final GameListener gameListener;
    private State state;

    public TicTacToe(GameListener gameListener) {
        this.gameListener = gameListener;
        this.state = new TicTacToeInitialState();
    }

    @Override
    public Game start() {
        state = state.start();
        gameListener.started(this);
        return this;
    }

    @Override
    public Game stop() {
        state = state.stop();
        gameListener.stopped(this);
        return this;
    }

    private interface State {
        State start();

        State stop();
    }

    private class TicTacToeInitialState implements State {
        @Override
        public State start() {
            return new TicTacToeStartedState();
        }

        @Override
        public State stop() {
            throw new RuntimeException("Game has not started");
        }
    }

    private class TicTacToeStartedState implements State {
        @Override
        public State start() {
            throw new RuntimeException("Game already started");
        }

        @Override
        public State stop() {
            return new TicTacToeInitialState();
        }
    }
}
