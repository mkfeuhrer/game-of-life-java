package com.gojek.bootcamp.gameoflife.Game;

import com.gojek.bootcamp.gameoflife.Board.Board;
import com.gojek.bootcamp.gameoflife.Board.Cell;

public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public Board getBoardClass() {
        return board;
    }

    public Cell[][] start() {
        return getBoardClass().getCells();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Game of Life!!");
        Board board = new Board(new Cell[5][5]);
        Game game = new Game(board);
        game.getBoardClass().showBoard();
        game.start();
    }
}
