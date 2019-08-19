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

    public Cell[][] start() {
        return getBoardClass().getCells();
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
        game.start();
        game.getBoardClass().showBoard();
    }
}
