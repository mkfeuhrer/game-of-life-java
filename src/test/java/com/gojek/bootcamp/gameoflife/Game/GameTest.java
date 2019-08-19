package com.gojek.bootcamp.gameoflife.Game;

import com.gojek.bootcamp.gameoflife.Board.Board;
import com.gojek.bootcamp.gameoflife.Board.Cell;
import com.gojek.bootcamp.gameoflife.Board.DeadCell;
import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    public Game createEmptyGame() {
        Cell[][] board = new Cell[5][5];
        Board boardClass = new Board(board);
        Game game = new Game(boardClass);
        int size = game.getBoardClass().getCells().length;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                board[row][col] = new DeadCell();
            }
        }
        return game;
    }

    @Test
    public void shouldReturnBoardAfterStateChanges() {
        Game game = createEmptyGame();
        Cell[][] board = game.getBoardClass().getCells();
        game.changeStates(board);
        Assert.assertEquals(
                game.getBoardClass().toArray(),
                new Board(game.getBoardClass().getCells()).toArray());
    }

    @Test
    public void shouldReturnZeroNeighboursForEmptyBoard() {
        Game game = createEmptyGame();
        int output = game.CountAliveNeighbours(game.getBoardClass().getCells(), 1, 1);
        Assert.assertEquals(0, output);
    }

    @Test
    public void shouldCountNumberOfAliveNeighbours() {
        Game game = createEmptyGame();
        game.getBoardClass().setSingleCell(0, 1, 1);
        int output = game.CountAliveNeighbours(game.getBoardClass().getCells(), 1, 1);
        Assert.assertEquals(1, output);
    }

    @Test
    public void TestCheckGameBounds() {
        Game game = createEmptyGame();
        boolean output = game.checkBounds(0, 0);
        Assert.assertTrue(output);

        output = game.checkBounds(-1, 0);
        Assert.assertFalse(output);

        output = game.checkBounds(0, -1);
        Assert.assertFalse(output);

        output = game.checkBounds(101, 0);
        Assert.assertFalse(output);

        output = game.checkBounds(0, 101);
        Assert.assertFalse(output);

        output = game.checkBounds(101, 101);
        Assert.assertFalse(output);

        output = game.checkBounds(-1, -1);
        Assert.assertFalse(output);
    }
}
