import java.util.Scanner;
import static java.lang.System.*;

public class KittyMap
{
    private boolean[][] kittyGrid;
    private int rows;
    private int cols;


    /*
     *this constructor loads in random true and false values
     */
    public KittyMap(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        kittyGrid = new boolean[rows][cols];
        for(int r = 0;r<kittyGrid.length;r++)
        {
            for(int c = 0;c<kittyGrid[r].length;c++)
            {
                int num = (int)(Math.random()*10)+1;
                if(num<= 3)
                {
                    kittyGrid[r][c] = true;
                }
                else
                {
                    kittyGrid[r][c] = false;
                }
            }
        }
    }

    /*
     *this method will call getKittyCountsGrid
     *to retrieve the kitty counts for the kittyGrid
     */
    public void printKittyCount()
    {
        System.out.println("The amount of kitties is " + getKittyCount(rows,cols));
    }

    /*
     *this method will calculate the kitty counts for each cell
     *if cell is true set int value to 9
     *if cell is not true set int value to cnt of kitties in adjacent cells
     */
    private int[][] getKittyCountsGrid()
    {
        int[][] kitCount = new int[rows][cols];
        for(int r = 0; r<kittyGrid.length;r++) {
            for (int c = 0; c < kittyGrid[r].length; c++) {
                if(kittyGrid[r][c])
                {
                    kitCount[r][c] = 9;
                }
                else
                {
                    kitCount[r][c] = 0;
                }

            }
        }
        for(int r = 0; r<kittyGrid.length;r++){
            for(int c = 0;c<kittyGrid[r].length;c++)
            {
                for(int i =r-1;i<=r+1;i++)
                {
                    for(int k = c-1;k<=c;k++)
                    {
                        if(kitCount[r][c] == 9)
                        {
                            if(inBounds(i,k) && kitCount[i][k]!=9)
                            {
                                kitCount[i][k]++;
                            }
                        }
                    }
                }
            }
        }
        return kitCount;
    }

    /*
     *this method will return the value of the current cell
     *if this cell contains a kitty - return 9
     *otherwise - return the cnt of all kitties in adjacent cells
     */
    public int getKittyCount( int r, int c)
    {
     int num = 0;
       for( r = 0;r < getKittyCountsGrid().length;r++)
       {
           for(c = 0;c<getKittyCountsGrid()[r].length;c++)
           {
               if(getKittyCountsGrid()[r][c] == 9)
               {
                   num++;
               }
           }

       }
        return num;
    }

    /*
     *check r and c to ensure they are inside the grid
     */
    private boolean inBounds( int r, int c)
    {
        if(r>=0&&r<kittyGrid.length&&c>=0&&c<kittyGrid[0].length)
        {
            return true;
        }
        return false;
    }

    /*
     *return the kitty grid as a string
     */
    public String toString()
    {
        String output = "80 point version \n";
        for(int out = 0; out <  kittyGrid.length; out++)
        {
            for(int in = 0; in <  kittyGrid[out].length; in++)

            {

                if (kittyGrid[out][in] == true)
                {
                    output += 1;
                }
                else
                    output += 0;
                output += " ";
            }
            output += "\n";
        }
        output += "\n 100 point version \n";

        getKittyCountsGrid();
        for(int out = 0; out <  rows; out++)
        {
            for(int in = 0; in <  cols; in++)
            {
                output += getKittyCountsGrid()[out][in];
                output += " ";
            }
            output += "\n";
        }
        return output.trim();
    }
}
