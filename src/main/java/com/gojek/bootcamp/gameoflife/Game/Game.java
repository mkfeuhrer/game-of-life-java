package com.gojek.bootcamp.gameoflife.Game;

import com.gojek.bootcamp.gameoflife.Board.Board;

public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public Board getBoardClass() {
        return board;
    }

    public int[][] start() {
        return getBoardClass().getBoard();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Game of Life!!");
        Board board = new Board(5);
        Game game = new Game(board);
        game.getBoardClass().showBoard();
        game.start();
    }
}
