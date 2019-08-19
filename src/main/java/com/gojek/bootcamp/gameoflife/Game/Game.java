package com.gojek.bootcamp.gameoflife.Game;

import com.gojek.bootcamp.gameoflife.Board.AliveCell;
import com.gojek.bootcamp.gameoflife.Board.Board;
import com.gojek.bootcamp.gameoflife.Board.Cell;
import com.gojek.bootcamp.gameoflife.Board.DeadCell;
import java.util.Scanner;

public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public Board getBoardClass() {
        return board;
    }

    public boolean checkBounds(int row, int col) {
        int len = getBoardClass().getCells().length;
        if (row >= len || row < 0) return false;
        if (col >= len || col < 0) return false;
        return true;
    }

    public int CountAliveNeighbours(Cell[][] board, int checkRow, int checkCol) {
        int aliveNeighbours = 0;
        for (int row = -1; row <= 1; row++) {
            for (int col = -1; col <= 1; col++) {
                if (checkBounds(checkRow + row, checkCol + col)
                        && board[checkRow + row][checkCol + col].getValue() == 1) {
                    aliveNeighbours++;
                }
            }
        }
        return aliveNeighbours;
    }

    public void changeStates(Cell[][] board) {
        Cell[][] newBoard = new Cell[board.length][board.length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                int aliveNeighbours = CountAliveNeighbours(board, row, col);
                if (aliveNeighbours != 0 && board[row][col].isAlive()) {
                    newBoard[row][col] = new AliveCell();
                } else {
                    newBoard[row][col] = new DeadCell();
                }
            }
        }
        getBoardClass().setCells(newBoard);
    }

    public static Cell[][] handleInitialInput(Cell[][] board) {
        System.out.println("Enter number of live cells initially\n");
        Scanner input = new Scanner(System.in);
        int numberOfLiveCells = input.nextInt();
        for (int cells = 0; cells < numberOfLiveCells; cells++) {
            System.out.println("Enter row and col of live cell :");
            int row = input.nextInt();
            int col = input.nextInt();
            if (row >= board.length || col >= board.length) {
                System.out.println(
                        "Failed :: Out of bounds, Memory exceeded! Try smaller index value");
                System.exit(0);
            }
            board[row][col] = new AliveCell();
        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (!(board[row][col] instanceof AliveCell)) {
                    board[row][col] = new DeadCell();
                }
            }
        }
        return board;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Game of Life!!");
        Board board = new Board(new Cell[5][5]);
        Game game = new Game(board);
        game.getBoardClass().setCells(handleInitialInput(board.getCells()));
        System.out.println("Enter number of iterations after which you want to see life :");
        Scanner input = new Scanner(System.in);
        int iterationCount = input.nextInt();
        while (iterationCount > 0) {
            System.out.println("Life is running, are you ?\nCurrent State of Life :");
            game.changeStates(game.getBoardClass().getCells());
            game.getBoardClass().showBoard();
            iterationCount--;
        }
        game.getBoardClass().showBoard();
    }
}
