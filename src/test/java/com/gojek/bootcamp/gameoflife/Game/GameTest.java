package com.gojek.bootcamp.gameoflife.Game;

import com.gojek.bootcamp.gameoflife.Board.Board;
import com.gojek.bootcamp.gameoflife.Board.Cell;
import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    @Test
    public void shouldReturnCurrentBoardStateWhenGameStarts() {
        Board board = new Board(new Cell[5][5]);
        Game game = new Game(board);
        Cell[][] expectedBoard = new Cell[5][5];
        Assert.assertEquals("Check current board state", expectedBoard, game.start());
    }
}
