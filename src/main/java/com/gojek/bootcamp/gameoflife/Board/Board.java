package com.gojek.bootcamp.gameoflife.Board;

public class Board {
    private int[][] board;

    public Board(int size) {
        this.board = new int[size][size];
    }

    public int[][] getBoard() {
        return board;
    }
}
