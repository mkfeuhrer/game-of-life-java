package com.gojek.bootcamp.gameoflife.Board;

public class DeadCell implements Cell {
    public DeadCell() {}

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public String getString() {
        return " □";
    }
}
