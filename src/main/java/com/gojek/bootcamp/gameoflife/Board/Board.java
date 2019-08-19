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

    public int getExtremeLeft() {
        int extremeLeft = this.cells.length;
        for (int row = 0; row < this.cells.length; row++) {
            for (int col = 0; col < this.cells.length; col++) {
                if (this.cells[row][col].getValue() == 1) {
                    extremeLeft = Math.min(extremeLeft, col);
                }
            }
        }
        return extremeLeft;
    }

    public int getExtremeRight() {
        int extremeRight = 0;
        for (int row = 0; row < this.cells.length; row++) {
            for (int col = 0; col < this.cells.length; col++) {
                if (this.cells[row][col].getValue() == 1) {
                    extremeRight = Math.max(extremeRight, col);
                }
            }
        }
        return extremeRight;
    }

    public int getExtremeTop() {
        int extremeTop = this.cells.length;
        for (int row = 0; row < this.cells.length; row++) {
            for (int col = 0; col < this.cells.length; col++) {
                if (this.cells[row][col].getValue() == 1) {
                    extremeTop = Math.min(extremeTop, row);
                }
            }
        }
        return extremeTop;
    }

    public int getExtremeBottom() {
        int extremeBottom = 0;
        for (int row = 0; row < this.cells.length; row++) {
            for (int col = 0; col < this.cells.length; col++) {
                if (this.cells[row][col].getValue() == 1) {
                    extremeBottom = Math.max(extremeBottom, row);
                }
            }
        }
        return extremeBottom;
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void expandRightAndBottom() {
        int size = this.cells.length;
        Cell[][] newBoard = new Cell[size + 1][size + 1];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                newBoard[row][col] = this.cells[row][col];
            }
        }
        for (int cells = 0; cells < size + 1; cells++) {
            newBoard[size][cells] = new DeadCell();
            newBoard[cells][size] = new DeadCell();
        }
        setCells(newBoard);
    }

    public void expandTopAndLeft() {
        int size = this.cells.length;
        Cell[][] newBoard = new Cell[size + 1][size + 1];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                newBoard[row + 1][col + 1] = this.cells[row][col];
            }
        }
        for (int cells = 0; cells < size + 1; cells++) {
            newBoard[0][cells] = new DeadCell();
            newBoard[cells][0] = new DeadCell();
        }
        setCells(newBoard);
    }

    public void expandGrid() {
        int extremeLeft = this.getExtremeLeft();
        int extremeRight = this.getExtremeLeft();
        int extremeTop = this.getExtremeTop();
        int extremeBottom = this.getExtremeBottom();

        if (Math.abs(extremeRight - this.cells.length) == 1
                || Math.abs(extremeBottom - this.cells.length) == 1) {
            expandRightAndBottom();
        }
        if (extremeLeft == 0 || extremeTop == 0) {
            expandTopAndLeft();
        }
    }

    public void showBoard() {
        for (int row = 0; row < this.cells.length; row++) {
            for (int col = 0; col < this.cells.length; col++) {
                System.out.print(this.cells[row][col].getString());
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
