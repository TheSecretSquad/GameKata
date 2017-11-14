package com.thingo.game.impl;

import com.thingo.game.Game;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {

    // List the behaviour we want from Game
    // then take each behaviour and implement it.

    // Read the items below as "The Class Under Test 'Game' ..."

    // shouldBeStartable
    // shouldBeStopable

    @Test
    public void shouldBeStartable() {
        FakePlayers players = new FakePlayers();
        Game game = new TicTacToe(players);
        game = game.start();
        assertGameHasStarted(players);
    }

    private void assertGameHasStarted(FakePlayers players) {
        assertTrue(players.hasStartedPlaying());
    }
}