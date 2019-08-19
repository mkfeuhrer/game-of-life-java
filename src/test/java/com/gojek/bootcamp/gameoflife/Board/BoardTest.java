package com.gojek.bootcamp.gameoflife.Board;

import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

    public Board createBoard() {
        Cell[][] cells = new Cell[5][5];
        int size = cells.length;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                cells[row][col] = new DeadCell();
            }
        }
        return new Board(cells);
    }

    @Test
    public void shouldReturnCurrentBoardState() {
        Cell[][] cells = new Cell[5][5];
        Board board = new Board(cells);
        Cell[][] expectedBoard = new Cell[5][5];
        Assert.assertEquals("Initialize board", expectedBoard, board.getCells());
    }

    @Test
    public void shouldSetSingleCell() {
        Cell[][] cells = new Cell[5][5];
        Board board = new Board(cells);
        board.setSingleCell(0, 0, 1);
        Assert.assertEquals(1, board.getCells()[0][0].getValue());
        board.setSingleCell(0, 0, 0);
        Assert.assertEquals(0, board.getCells()[0][0].getValue());
    }

    @Test
    public void shouldReturnLeftmostColumnIndex() {
        Board board = createBoard();
        board.setSingleCell(2, 1, 1);
        Assert.assertEquals(1, board.getExtremeLeft());
        board.setSingleCell(1, 0, 1);
        Assert.assertEquals(0, board.getExtremeLeft());
    }

    @Test
    public void shouldReturnRightmostColumnIndex() {
        Board board = createBoard();
        board.setSingleCell(2, 3, 1);
        Assert.assertEquals(3, board.getExtremeRight());
        board.setSingleCell(1, 4, 1);
        Assert.assertEquals(4, board.getExtremeRight());
    }
}
