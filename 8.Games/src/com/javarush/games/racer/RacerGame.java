package com.javarush.games.racer;

import com.javarush.engine.cell.*;

public class RacerGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    public static final int CENTER_X = WIDTH / 2;
    public static final int ROADSIDE_WIDTH = 14;
    private RoadMarking roadMarking;
    private PlayerCar player;

    private void createGame() {
        roadMarking = new RoadMarking();
        player = new PlayerCar();
        drawScene();
        setTurnTimer(40);
    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        if (x < WIDTH && x >= 0 && y >= 0 && y < HEIGHT) {
            super.setCellColor(x, y, color);
        } else {
        }
    }

    private void drawScene() {
        drawField();
        roadMarking.draw(this);
        player.draw(this);
    }

    private void drawField() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                if (x == CENTER_X) setCellColor(CENTER_X, y, Color.WHITE);
                else if (x >= ROADSIDE_WIDTH && x < (WIDTH - ROADSIDE_WIDTH)) setCellColor(x, y, Color.DIMGREY);
                else setCellColor(x, y, Color.GREEN);
            }
        }
    }


    @Override
    public void initialize() {
        super.initialize();
        showGrid(false);
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void moveAll() {
        roadMarking.move(player.speed);
        player.move();
    }


    @Override
    public void onKeyPress(Key key) {
        //super.onKeyPress(key);
        if (key == Key.RIGHT) player.setDirection(Direction.RIGHT);
        else if (key == Key.LEFT) player.setDirection(Direction.LEFT);
    }

    @Override
    public void onKeyReleased(Key key) {
        //super.onKeyReleased(key);
        if (player.getDirection() == Direction.RIGHT&& key == Key.RIGHT) player.setDirection(Direction.NONE);
        else if (player.getDirection() == Direction.LEFT&& key == Key.LEFT) player.setDirection(Direction.NONE);
    }

    @Override
    public void onTurn(int step) {
        //super.onTurn(step);
        moveAll();
        drawScene();
    }
}
