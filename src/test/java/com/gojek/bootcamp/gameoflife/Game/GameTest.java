package com.gojek.bootcamp.gameoflife.Game;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    @Test
    public void shouldReturnCurrentBoardState() {
        Game game = new Game();
        int[][] board = new int[5][5];
        Assert.assertEquals("Empty board", board, game.getBoard(5));
    }
}
