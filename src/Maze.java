import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class Maze {
    private int[][] maze;
    private boolean exitFound;
    private boolean[][] visited;
    private char[][] bonusMaze;
    private int path;

    public Maze(int size, String line) {
        // instantiate maze 2d Array

        // assign exitFound a value
        bonusMaze = new char[size][size];
        visited = new boolean[size][size];
        maze = new int[size][size];
        int index = 0;
        for (int r = 0; r < maze.length; r++){
            for (int c = 0; c < maze[r].length; c++){
                maze[r][c] = Integer.parseInt(line.substring(index, index++ + 1));
    }
}
path = size * size;

    }

    public boolean checkForExitPath(int r, int c,int k) {


        if(inBounds(r,c) && !visited[r][c] && maze[r][c] == 1)
        {
            visited[r][c] = true;
            k++;
            maze[r][c] = 5;

            if(c == maze[0].length-1)
            {
                exitFound = true;
                if(k<path)
                {
                    path = k;
                    for(int i = 0; i< maze.length; i++)
                    {
                        for(int l = 0; l < maze[i].length; l++)
                        {
                            if(maze[i][l] == 1 )
                            {
                                bonusMaze[i][l] = '1';
                            }
                            if(maze[i][l] == 0 )
                            {
                                bonusMaze[i][l] = '0';
                            }
                            if(maze[i][l] == 5 )
                            {
                                bonusMaze[i][l] = 'P';
                            }
                        }
                    }
                }

            }
            else {


                checkForExitPath(r + 1, c, k);
                checkForExitPath(r - 1, c, k);
                checkForExitPath(r, c + 1, k);
                checkForExitPath(r, c - 1, k);
            }
                k--;
                visited[r][c] = false;
                maze[r][c] = 1;

        }

        return false;
    }
    private boolean inBounds(int row, int col){
        return row >= 0 && row < maze.length && col >= 0 && col < maze[0].length ;
    }

    public String toString() {
        String output = "";
        for (int r = 0; r < maze.length; r++) {
            for (int c = 0; c < maze[r].length; c++) {
                output += ""+  bonusMaze[r][c] + " ";
            }
            output += "\n";
        }

        if(exitFound == true)
        {
            out.println("exit found - " + path + " STEPS");

        }
        else
        {
            out.println("exit not found");
        }
        return output;
    }
}


class MazeRunner {
    public static void main(String args[]) throws IOException {


        Maze test = new Maze(5, "1000111110001010111000001");
        test.checkForExitPath(0, 0, 0);
        System.out.println(test);

        test = new Maze(7, "1000011111101000100100111010010101001011100101001");
        test.checkForExitPath(0, 0, 0);
        System.out.println(test);

        test = new Maze(7, "1000010111101000100100111010010101001011100101010");
        test.checkForExitPath(0, 0, 0);
        System.out.println(test);

        test = new Maze(7, "1011010111111000100010111111010101011111100101010");
        test.checkForExitPath(0, 0, 0);
        System.out.println(test);

        test = new Maze(10, "1011010111111111010100100011110111111101010101010111111101110101010001011101000001010101110111110111");
        test.checkForExitPath(0, 0, 0);
        System.out.println(test);
        test = new Maze(10, "1011011110111111010100100011100111111101010101010111111101100101010000011101001101010101110111110111");
        test.checkForExitPath(0, 0, 0);
        System.out.println(test);

    }
}