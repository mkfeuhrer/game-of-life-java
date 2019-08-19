package com.gojek.bootcamp.gameoflife.Game;

import com.gojek.bootcamp.gameoflife.Board.Board;
import com.gojek.bootcamp.gameoflife.Board.Cell;
import com.gojek.bootcamp.gameoflife.Board.DeadCell;
import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    @Test
    public void shouldReturnBoardAfterStateChanges() {
        Cell[][] board = new Cell[5][5];
        Board boardClass = new Board(board);
        Game game = new Game(boardClass);

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = new DeadCell();
            }
        }
        game.changeStates(board);
        Assert.assertEquals(
                boardClass.toArray(), new Board(game.getBoardClass().getCells()).toArray());
    }
}
