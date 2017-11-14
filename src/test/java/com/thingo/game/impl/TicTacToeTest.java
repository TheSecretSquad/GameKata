package com.thingo.game.impl;

import com.thingo.game.Game;
import com.thingo.game.Players;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TicTacToeTest {

    // List the behaviour we want from Game
    // then take each behaviour and implement it.

    // Read the items below as "The Class Under Test 'Game' ..."

    // shouldBeStartable
    // shouldBeStopable

    @Test
    public void shouldBeStartable() {
        Players players = mock(Players.class);
        Game game = new TicTacToe(players);
        game = game.start();
        assertGameHasStarted(players);
    }

    private void assertGameHasStarted(Players players) {
        verify(players, times(1)).start();
    }
}