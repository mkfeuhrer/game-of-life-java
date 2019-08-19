package com.gojek.bootcamp.gameoflife.Board;

public class Board {
    private int[][] board;

    public Board(int size) {
        this.board = new int[size][size];
    }

    public int[][] getBoard() {
        return board;
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void showBoard() {
        for (int row = 0; row < this.board.length; row++) {
            for (int col = 0; col < this.board.length; col++) {
                if (this.board[row][col] == 0) {
                    System.out.print(" □");
                } else {
                    System.out.print(" ▦");
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
            clearScreen();
        }
    }
}
