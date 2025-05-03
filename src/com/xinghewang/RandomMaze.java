package com.xinghewang;

import java.util.Random;

public class RandomMaze extends Maze{
    public RandomMaze(int rows, int cols, double wallProbability) {
        super(rows,cols);

        Random random = new Random();

        for (int row = 0; row <rows ; row++){
            for (int col = 0; col < cols ; col ++){
                if (random.nextDouble() < wallProbability){
                    try{
                        setWall(row, col);
                    } catch (MazeBoundsException e){

                    }
                }
            }
        }
    }

}
