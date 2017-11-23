package com.thingo.game.impl;

import com.thingo.game.Game;
import com.thingo.game.GameListener;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import static org.mockito.Mockito.mock;

public class TicTacToeTest {

    // List the behaviour we want from Game
    // then take each behaviour and implement it.

    // Read the items below as "The Class Under Test 'Game' ..."

    // shouldBeStartable
    // shouldBeStoppable

    @Test
    public void shouldBeStartable() {
        GameListener gameListener = mock(GameListener.class);
        Game game = new TicTacToe(gameListener);
        game = game.start();
        assertGameHasStarted(game, gameListener);
    }

    @Test
    public void shouldBeStoppable() {
        GameListener gameListener = mock(GameListener.class);
        Game game = new TicTacToe(gameListener);
        game = game.start()
                   .stop();
        assertGameHasStopped(game, gameListener);
    }

    private void assertGameHasStarted(Game game, GameListener gameListener) {
        verify(gameListener, times(1)).started(eq(game));
    }

    private void assertGameHasStopped(Game game, GameListener gameListener) {
        verify(gameListener, times(1)).stopped(eq(game));
    }
}