package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

import java.util.Arrays;


public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped = false;
    private int score;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        gameField = new int[SIDE][SIDE];
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                setCellColoredNumber(x, y, gameField[y][x]);
            }
        }
    }

    private void createNewNumber() {
        if (getMaxTileValue() == 2048) win();
        while (true) {
            int x = getRandomNumber(SIDE);
            int y = getRandomNumber(SIDE);
            if (gameField[x][y] == 0) {
                int number = getRandomNumber(10);
                if (number == 9) gameField[x][y] = 4;
                else gameField[x][y] = 2;
                break;
            }
        }
    }

    private Color getColorByValue(int value) {
        if (value == 0) return Color.LIGHTGRAY;
        else if (value == 2) return Color.LIGHTBLUE;
        else if (value == 4) return Color.LIGHTGREEN;
        else if (value == 8) return Color.LIGHTCORAL;
        else if (value == 16) return Color.LIGHTCYAN;
        else if (value == 32) return Color.LIGHTGOLDENRODYELLOW;
        else if (value == 64) return Color.BLUE;
        else if (value == 128) return Color.GREEN;
        else if (value == 256) return Color.CORAL;
        else if (value == 512) return Color.CYAN;
        else if (value == 1024) return Color.ANTIQUEWHITE;
        else return Color.GOLD;
    }

    private void setCellColoredNumber(int x, int y, int value) {
        if (value == 0) setCellValueEx(x, y, Color.LIGHTGRAY, "");
        else setCellValueEx(x, y, getColorByValue(value), "" + value);
    }

    private boolean compressRow(int[] row) {
        int[] bufferedRow = new int[row.length];
        for (int i = 0; i < row.length; i++) {
            if (row[i] != 0) {
                for (int j = 0; j < bufferedRow.length; j++) {
                    if (bufferedRow[j] == 0) {
                        bufferedRow[j] = row[i];
                        break;
                    }
                }
            }
        }
        if (Arrays.equals(row, bufferedRow)) {
            System.arraycopy(bufferedRow, 0, row, 0, row.length);
            return false;
        } else {
            System.arraycopy(bufferedRow, 0, row, 0, row.length);
            return true;
        }
    }

    private boolean mergeRow(int[] row) {

        int[] bufferedRow = new int[row.length];
        System.arraycopy(row, 0, bufferedRow, 0, row.length);
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] != 0 && (row[i] == row[i + 1])) {
                row[i] = row[i] + row[i + 1];
                row[i + 1] = 0;
                setScore(score += row[i]);
            }
        }
        if (Arrays.equals(row, bufferedRow)) return false;
        else return true;
    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped) {
            if (key == Key.SPACE) {
                isGameStopped = false;
                createGame();
                drawScene();
                score = 0;
                setScore(score);
            }
        } else {
            if (!canUserMove()) gameOver();
            else {
                if (key == Key.LEFT) {
                    moveLeft();
                    drawScene();
                } else if (key == Key.RIGHT) {
                    moveRight();
                    drawScene();
                } else if (key == Key.UP) {
                    moveUp();
                    drawScene();
                } else if (key == Key.DOWN) {
                    moveDown();
                    drawScene();
                }
            }
        }
    }

    private void moveLeft() {
        boolean compress = false;
        boolean compressS = false;
        boolean merge = false;
        int count = 0;
        for (int x = 0; x < gameField.length; x++) {
            compress = compressRow(gameField[x]);
            merge = mergeRow(gameField[x]);
            compressS = compressRow(gameField[x]);
            if (compress || merge || compressS) count++;
        }
        if (count > 0) createNewNumber();
    }

    private void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

    private void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }

    private void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private void rotateClockwise() {
        int[][] resultArray = new int[gameField[0].length][gameField.length];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                resultArray[j][gameField.length - i - 1] = gameField[i][j];
            }
        }
        for (int i = 0; i < resultArray.length; ++i) {
            System.arraycopy(resultArray[i], 0, gameField[i], 0, resultArray[i].length);
        }
    }

    private int getMaxTileValue() {
        int maxValue = 0;
        for (int x = 0; x < gameField.length; x++) {
            for (int y = 0; y < gameField.length; y++) {
                if (gameField[x][y] > maxValue) maxValue = gameField[x][y];
            }
        }
        return maxValue;
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "You WIN", Color.BLACK, 70);
    }

    private boolean canUserMove() {
        for (int[] value : gameField) {
            for (int y = 0; y < gameField.length; y++) {
                if (value[y] == 0) return true;
            }
        }
        for (int[] ints : gameField) {
            for (int y = 0; y < gameField.length - 1; y++) {
                if (ints[y] == ints[y + 1]) return true;
            }
        }
        rotateClockwise();
        for (int[] ints : gameField) {
            for (int y = 0; y < gameField.length - 1; y++) {
                if (ints[y] == ints[y + 1]) return true;
            }
        }
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        return false;
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "GAME OVER", Color.BLACK, 70);
    }
}
