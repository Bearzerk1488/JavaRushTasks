package com.javarush.games.racer;

import com.javarush.engine.cell.*;

public class GameObject {
    public int x;
    public int y;
    public int [][] matrix;
    public int width;
    public int height;

    public GameObject(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
        this.width = matrix[0].length;
        this.height = matrix.length;
    }
    public void draw (Game game){
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[0].length; y++) {
                game.setCellColor(this.x +x, this.y+y,Color.values()[matrix[x][y]]);
            }
        }
    }
}
