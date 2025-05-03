package com.xinghewang;

public class Maze {
    private int rows;
    private int cols;
    private String[][] structure;


    public Maze(int rows, int cols){
        if (rows <= 0 || cols <= 0){
            throw new RuntimeException("rows and cols must be greater than 0");
        }
        this.rows = rows;
        this.cols = cols;
        structure = new String[rows][cols];
        for (int row = 0; row <rows ; row++){
            for (int col = 0; col < cols ; col ++){
                structure[row][col] = " ";
                }
            }
        }

    // Puts a wall at the given row and column.
    // Throws a MazeBoundsException if the row or column is invalid.
    public void setWall(int row, int col) throws MazeBoundsException {
        if(row > rows || col > cols){
            throw new MazeBoundsException("Wall is out of Maze's bound");
        }
        structure[row][col] = "#";

    }

    // Returns true if there is a wall at the given row and column.
    // Throws a MazeBoundsException if the row or column is invalid.
    public boolean isWall(int row, int col) throws MazeBoundsException {
        if(row > rows || col > cols){
            throw new MazeBoundsException("location searched is out of Maze's bound");
        }
        else if( structure[row][col] == "#") return true;
        else return false;
    }

    public void print(){
        for (int i = 0; i < rows ; i++){
            for (int j = 0; j < cols ;j ++){
                String cell = structure[i][j];
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
