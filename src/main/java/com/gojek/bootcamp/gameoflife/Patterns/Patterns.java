package com.gojek.bootcamp.gameoflife.Patterns;

public class Patterns {
    public static final int[][] Block = {
        {0, 1, 1, 0},
        {1, 0, 0, 1},
        {0, 1, 0, 1},
        {0, 0, 1, 0},
    };

    public static final int[][] Loaf = {
        {0, 0, 0, 0, 0},
        {0, 1, 1, 0, 0},
        {0, 1, 0, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0}
    };

    public static final int[][] Boat = {
        {0, 0, 0, 0},
        {0, 1, 1, 0},
        {0, 1, 1, 0},
        {0, 0, 0, 0},
    };

    public static final int[][] Toad = {
        {0, 1, 1, 1},
        {1, 1, 1, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0}
    };

    public static final int[][] Blinker = {
        {0, 1, 0, 0},
        {0, 1, 0, 0},
        {0, 1, 0, 0},
        {0, 0, 0, 0}
    };

    public static final int[][] Pulsar = {
        {0, 0, 1, 1, 1, 0},
        {0, 0, 0, 0, 0, 0},
        {1, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 1},
        {0, 0, 1, 1, 1, 0},
    };

    public static final int[][] Pentadecathlon = {
        {0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
        {1, 1, 0, 1, 1, 1, 1, 0, 1, 1},
        {0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public static final int[][] Glider = {
        {0, 0, 1, 0},
        {1, 0, 1, 0},
        {0, 1, 1, 0},
        {0, 0, 0, 0}
    };

    public static final int[][] LWSS = {
        {0, 1, 0, 0, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 0},
    };
}
