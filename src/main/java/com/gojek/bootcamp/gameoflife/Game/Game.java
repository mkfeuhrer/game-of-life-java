package com.gojek.bootcamp.gameoflife.Game;

public class Game {
    public Game() {}

    public int[][] getBoard(int size) {
        int board[][] = new int[size][size];
        return board;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Game of Life!!");
        Game game = new Game();
        game.getBoard(10);
    }
}
