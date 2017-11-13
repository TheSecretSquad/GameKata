package com.thingo.game.impl;

import com.thingo.game.Game;

public class TicTacToe implements Game {

    @Override
    public TicTacToe start() {
        return this;
    }

    public boolean started() {
        return true;
    }
}
