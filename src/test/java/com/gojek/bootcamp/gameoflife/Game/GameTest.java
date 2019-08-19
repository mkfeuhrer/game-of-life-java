package com.gojek.bootcamp.gameoflife.Game;

import com.gojek.bootcamp.gameoflife.Board.Board;
import com.gojek.bootcamp.gameoflife.Board.Cell;
import com.gojek.bootcamp.gameoflife.Board.DeadCell;
import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    public Game createGame() {
        Cell[][] board = new Cell[5][5];
        Board boardClass = new Board(board);
        return new Game(boardClass);
    }

    @Test
    public void shouldReturnBoardAfterStateChanges() {
        Game game = createGame();
        Cell[][] board = game.getBoardClass().getCells();
        int size = game.getBoardClass().getCells().length;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                board[row][col] = new DeadCell();
            }
        }
        game.changeStates(board);
        Assert.assertEquals(
                game.getBoardClass().toArray(),
                new Board(game.getBoardClass().getCells()).toArray());
    }

    @Test
    public void shouldReturnZeroForEmptyBoard() {
        Game game = createGame();
        int output = game.CountAliveNeighbours(game.getBoardClass().getCells(), 1, 1);
        Assert.assertEquals(0, output);
    }
}
