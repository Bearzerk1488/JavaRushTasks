package com.javarush.games.racer;

import com.javarush.games.racer.road.RoadManager;

public class PlayerCar extends GameObject {
    public int speed = 1;
    private static int playerCarHeight = ShapeMatrix.PLAYER.length;
    private Direction direction;

    public void move() {
        if (direction == Direction.LEFT) this.x -= 1;
        else if (direction == Direction.RIGHT) this.x += 1;
        if (x < RoadManager.LEFT_BORDER) x = RoadManager.LEFT_BORDER;
        else if (x > RoadManager.RIGHT_BORDER) x = RoadManager.RIGHT_BORDER - width;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public PlayerCar() {
        super(RacerGame.WIDTH / 2 + 2, RacerGame.HEIGHT - playerCarHeight - 1, ShapeMatrix.PLAYER);
    }
}
