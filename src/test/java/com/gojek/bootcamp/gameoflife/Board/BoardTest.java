package com.gojek.bootcamp.gameoflife.Board;

import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

    @Test
    public void shouldReturnCurrentBoardState() {
        Board board = new Board(5);
        int expectedBoard[][] = new int[5][5];
        Assert.assertEquals("Initialize board", expectedBoard, board.getBoard());
    }
}
