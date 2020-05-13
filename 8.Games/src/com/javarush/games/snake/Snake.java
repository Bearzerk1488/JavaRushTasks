package com.javarush.games.snake;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;


import java.util.ArrayList;
import java.util.List;

import static com.javarush.games.snake.Direction.*;


public class Snake {
    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;
    private Direction direction = LEFT;

    public Snake(int x, int y) {
        for (int i = 0; i < 3; i++)
            snakeParts.add(new GameObject(x + i, y));

    }

    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++) {
            if (this.isAlive) {
                if (i == 0)
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, HEAD_SIGN, Color.BLACK, 75);
                else
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.BLACK, 75);
            } else {
                if (i == 0)
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, HEAD_SIGN, Color.RED, 75);
                else
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.RED, 75);
            }
        }
    }

    public void setDirection(Direction direction) {
        if (this.direction.ordinal() == (direction.ordinal() + 2) % direction.values().length) {
            return;
        } else if (this.direction == LEFT && snakeParts.get(0).x == snakeParts.get(1).x) {
            return;
        } else if (this.direction == RIGHT && snakeParts.get(0).x == snakeParts.get(1).x) {
            return;
        } else if (this.direction == UP && snakeParts.get(0).y == snakeParts.get(1).y) {
            return;
        } else if (this.direction == DOWN && snakeParts.get(0).y == snakeParts.get(1).y) {
            return;
        } else this.direction = direction;
    }

    public void move(Apple apple) {
        GameObject head = createNewHead();
        if (head.x < 0 || head.x > SnakeGame.WIDTH - 1 || head.y < 0 || head.y > SnakeGame.HEIGHT - 1) {
            isAlive = false;
            return;
        } else if (checkCollision(head)) {
            isAlive = false;
            return;
        } else if (head.x == apple.x && head.y == apple.y) {
            apple.isAlive = false;
            snakeParts.add(0, head);
        } else {
            snakeParts.add(0, head);
            removeTail();
        }
    }

    public GameObject createNewHead() {
        int x = snakeParts.get(0).x;
        int y = snakeParts.get(0).y;
        GameObject newHead = null;
        if (direction == LEFT) {
            newHead = new GameObject((x - 1), y);
        } else if (direction == RIGHT) {
            newHead = new GameObject((x + 1), y);
        } else if (direction == UP) {
            newHead = new GameObject(x, (y - 1));
        } else if (direction == DOWN) {
            newHead = new GameObject(x, (y + 1));
        }
        return newHead;
    }

    public void removeTail() {
        int tail = snakeParts.size() - 1;
        snakeParts.remove(tail);
    }

    public boolean checkCollision(GameObject object) {
        for (int i = 0; i < snakeParts.size(); i++) {
            if (object.x == snakeParts.get(i).x && object.y == snakeParts.get(i).y) return true;
        }
        return false;
    }

    public int getLength() {
        return snakeParts.size();
    }
}
