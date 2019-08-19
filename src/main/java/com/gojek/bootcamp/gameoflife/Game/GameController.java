package com.gojek.bootcamp.gameoflife.Game;

import com.gojek.bootcamp.gameoflife.Board.AliveCell;
import com.gojek.bootcamp.gameoflife.Board.Board;
import com.gojek.bootcamp.gameoflife.Board.Cell;
import com.gojek.bootcamp.gameoflife.Board.DeadCell;
import com.gojek.bootcamp.gameoflife.Patterns.Patterns;
import java.util.Scanner;

public class GameController {

    public static Game start() {
        Game game;
        System.out.println("Welcome to Game of Life!!");
        System.out.println("Enter 1 for predefined input, 2 for custom input");
        Scanner input = new Scanner(System.in);
        int[][] values = Patterns.Glider;
        int option = input.nextInt();
        if (option == 1) {
            System.out.println(
                    "1. Block\n"
                            + "2. Loaf \n"
                            + "3. Boat \n"
                            + "4. Toad \n"
                            + "5. Blinker \n"
                            + "6. Pulsar \n"
                            + "7. Pentadecathlon \n"
                            + "8 Glider \n"
                            + "9. LWSS \n"
                            + "10. GosperGlider \n");
            int choice = input.nextInt();
            if (choice == 1) values = Patterns.Block;
            else if (choice == 2) values = Patterns.Loaf;
            else if (choice == 3) values = Patterns.Boat;
            else if (choice == 4) values = Patterns.Toad;
            else if (choice == 5) values = Patterns.Blinker;
            else if (choice == 6) values = Patterns.Pulsar;
            else if (choice == 7) values = Patterns.Pentadecathlon;
            else if (choice == 8) values = Patterns.Glider;
            else if (choice == 9) values = Patterns.LWSS;
            else if (choice == 10) values = Patterns.GosperGlider;
            int size = values.length;
            Board board = new Board(new Cell[size][size]);
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    if (values[row][col] == 1) {
                        board.getCells()[row][col] = new AliveCell();
                    } else {
                        board.getCells()[row][col] = new DeadCell();
                    }
                }
            }
            game = new Game(board);
        } else {
            Board board = new Board(new Cell[10][10]);
            game = new Game(board);
            game.getBoardClass().setCells(Game.handleInitialInput(board.getCells()));
        }
        return game;
    }
}
