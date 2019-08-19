# Game of Life

## Problem Description

As a fan of games, I want to model [Convoy's game of life][1], with game starting from initial life state so that I can return state of life after each iteration.

### Requirements

- Any live cell with fewer than two live neighbours dies, as if by underpopulation.
- Any live cell with two or three live neighbours lives on to the next generation.
- Any live cell with more than three live neighbours dies, as if by overpopulation.
- Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

Return state of life after each iteration.

## Dev environment setup

- [Java OpenJDK 11](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot)

## Build instructions

```
./gradlew clean build
```

## Run test

```
./gradlew clean test
```

## Run instructions

```
./gradlew clean run
```

Input Instructions -

- First input number (N) of live cells initially.
- Next N Lines, enter zero indexed row and column of live cells.
- Enter how many iterations(X) you want to view ?

## Get Code Coverage

```
./gradlew jacocoTestReport
```

- To view report open :
```
gameoflife/build/reports/tests/test/index.html
```

## Limitation

- Throws out of bound if memory limit is reached.

## Demo

- Works for both predefined patterns and custom inputs.
- Automatically expands grid for patterns like glider.

Expanding Glider - 

![Glider](gameoflife-glider.gif)

Expanding Lightweight Space Ship(LWSS) -

![LWSS](gameoflife-lwss.gif)

Expanding Gosper Glider Gun - 

![Gosper Glider Gun](gameoflife-gosperglider.gif)

[1]: https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
