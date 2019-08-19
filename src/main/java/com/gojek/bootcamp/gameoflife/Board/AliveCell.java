package com.gojek.bootcamp.gameoflife.Board;

public class AliveCell implements Cell {

    public AliveCell() {}

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public String getString() {
        return " ▦";
    }

    @Override
    public int getValue() {
        return 1;
    }
}
