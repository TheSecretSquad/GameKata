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
        Game game = new TicTacToe();
        game = game.start();
        assertGameHasStarted(game);
    }

    private void assertGameHasStarted(Game game) {
        assertTrue("Game not started", false);
    }
}