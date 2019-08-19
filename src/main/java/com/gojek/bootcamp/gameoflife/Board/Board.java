package com.gojek.bootcamp.gameoflife.Board;

public class Board {
    private Cell[][] cells;

    public Board(Cell[][] cells) {
        this.cells = cells;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public void setSingleCell(int row, int col, int value) {
        if (value == 1) {
            this.cells[row][col] = new AliveCell();
        } else {
            this.cells[row][col] = new DeadCell();
        }
    }

    public int[][] toArray() {
        int size = this.cells.length;
        int[][] newBoard = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (cells[row][col].isAlive()) {
                    newBoard[row][col] = 1;
                }
            }
        }
        return newBoard;
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void showBoard() {
        for (int row = 0; row < this.cells.length; row++) {
            for (int col = 0; col < this.cells.length; col++) {
                if (this.cells[row][col].isAlive()) {
                    AliveCell aliveCell = new AliveCell();
                    System.out.print(aliveCell.getString());
                } else {
                    DeadCell deadCell = new DeadCell();
                    System.out.print(deadCell.getString());
                }
            }
            System.out.println();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }
        clearScreen();
    }
}
