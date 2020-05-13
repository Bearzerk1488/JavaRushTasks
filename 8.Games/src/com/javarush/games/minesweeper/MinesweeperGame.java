package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import sun.font.DelegatingShape;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 14;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private static final String MINE = "\u262a";
    private static final String FLAG = "\u2694";
    private int countFlags;
    private boolean isGameStopped;
    private int countClosedTiles = SIDE * SIDE;
    private int score = 0;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 2;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.DARKGRAY);
                setCellValue(x, y, "");
            }
        }

        countMineNeighbors();
        countFlags = countMinesOnField;
        //isGameStopped = false;
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                if (!gameField[y][x].isMine) {
                    int mineCount = 0;
                    List<GameObject> list = new ArrayList<>();
                    list = getNeighbors(gameField[y][x]);
                    for (int count = 0; count < list.size(); count++) {
                        GameObject object = list.get(count);
                        if (object.isMine) mineCount++;
                    }
                    gameField[y][x].countMineNeighbors = mineCount;
                }
            }

        }
    }

    private void openTile(int x, int y) {
        if (gameField[y][x].isOpen) {
            return;
        }
        if (gameField[y][x].isFlag) {
            return;
        }
        if (isGameStopped) {
            return;
        }
        if (gameField[y][x].isMine) {
            setCellValueEx(x, y, Color.RED, MINE);
            gameOver();
        } else if (!gameField[y][x].isMine && gameField[y][x].countMineNeighbors == 0) {
            gameField[y][x].isOpen = true;
            score += 5;
            countClosedTiles--;
            setCellValue(x, y, "");
            setCellColor(x, y, Color.GRAY);
            List<GameObject> list = getNeighbors(gameField[y][x]);
            for (int i = 0; i < list.size(); i++) {
                GameObject object = list.get(i);
                if (!gameField[object.y][object.x].isOpen)
                    openTile(object.x, object.y);
            }

        } else {
            setCellNumber(x, y, gameField[y][x].countMineNeighbors);
            gameField[y][x].isOpen = true;
            score += 5;
            countClosedTiles--;
            setCellColor(x, y, Color.LIGHTGREEN);
        }
        if (countClosedTiles == countMinesOnField && !gameField[y][x].isMine) {
            win();
            return;
        }
        setScore(score);

    }

    private void markTile(int x, int y) {
        if (gameField[y][x].isOpen) {
            return;
        }
        if (isGameStopped) {
            return;
        }
        if (!gameField[y][x].isOpen && countFlags != 0 && !gameField[y][x].isFlag) {
            gameField[y][x].isFlag = true;
            countFlags--;
            setCellValue(x, y, FLAG);
            setCellColor(x, y, Color.LIGHTYELLOW);
        } else if (gameField[y][x].isFlag) {
            gameField[y][x].isFlag = false;
            countFlags++;
            setCellValue(x, y, "");
            setCellColor(x, y, Color.DARKGRAY);
        }
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "\u2620 allahu akbar \u2620", Color.BLACK, 65);
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.GRAY, "\ud83c\udf89 You  are true Crusader \ud83c\udf89", Color.BLACK, 65);
    }

    private void restart() {
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        score = 0;
        countMinesOnField = 0;
        setScore(score);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            restart();
            return;
        } else openTile(x, y);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }
}