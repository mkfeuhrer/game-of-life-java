package com.gojek.bootcamp.gameoflife.Board;

import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

    @Test
    public void shouldReturnCurrentBoardState() {
        Cell[][] cells = new Cell[5][5];
        Board board = new Board(cells);
        Cell[][] expectedBoard = new Cell[5][5];
        Assert.assertEquals("Initialize board", expectedBoard, board.getCells());
    }
}
