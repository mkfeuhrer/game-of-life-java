package com.gojek.bootcamp.gameoflife.Board;

public class Board {
    private Cell[][] cells;

    public Board(Cell[][] cells) {
        this.cells = cells;
    }

    public Cell[][] getCells() {
        return cells;
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
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
            clearScreen();
        }
    }
}
