package com.gojek.bootcamp.gameoflife.Game;

import com.gojek.bootcamp.gameoflife.Board.Board;
import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    @Test
    public void shouldReturnCurrentBoardStateWhenGameStarts() {
        Board board = new Board(5);
        Game game = new Game(board);
        int[][] expectedBoard = new int[5][5];
        Assert.assertEquals("Check current board state", expectedBoard, game.start());
    }
}
