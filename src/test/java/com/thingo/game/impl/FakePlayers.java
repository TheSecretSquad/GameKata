package com.thingo.game.impl;

public class FakePlayers implements Players {

    private boolean hasStartedPlaying = false;

    public boolean hasStartedPlaying() {
        return hasStartedPlaying;
    }

    @Override
    public Players start() {
        hasStartedPlaying = true;
        return this;
    }
}
