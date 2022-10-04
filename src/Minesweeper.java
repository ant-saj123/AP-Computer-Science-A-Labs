public class Minesweeper {
    private boolean[][] mineGrid;
    private int[][] numberGrid;
    int rows;
    int cols;

    /** This constructor instantiates mineGrid and randomly assigns true to 10%
     * of cells.
     * @param rows
     * @param cols
     */
    public Minesweeper(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        mineGrid = new boolean[rows][cols];
        numberGrid = new int[rows][cols];
        //int r = 0;
        //int c = 0;
        for(int r = 0;r< mineGrid.length;r++)
        {
            for(int c = 0;c<mineGrid[r].length;c++)
            {
                int num =0;
                num = (int)(Math.random()*10)+1;
                if(num <=1)
                {
                    mineGrid[r][c] = true;
                }
                else
                {
                    mineGrid[r][c] = false;
                }
            }
        }



    }




    /** This method prints the mineGrid with a 1 for each cell containing a mine.
     * Empty cells should display 0.
     */
    public void printBooleanGrid(){
        for(int r = 0; r<mineGrid.length;r++)
        {
            for(int c = 0;c<mineGrid[r].length;c++)
            {
                if(mineGrid[r][c])
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    /** This method will determine the grid values indicating the number of mines and adjacent mines
     *  for each cell.
     *
     *  If the cell contains a mine, that cell should be set to 9.
     *  Cells not containing a mine should display the number of adjacent mines.
     * @return an integer matrix with int values for each cell.
     */
    public void setNumberGrid(){
        for(int r = 0; r<mineGrid.length; r++)
        {
            for(int c = 0; c< mineGrid[r].length;c++)
            {
                if(mineGrid[r][c])
                {
                    numberGrid[r][c] = 9;
                }
                else
                {
                    numberGrid[r][c] = 0;
                }
            }

        }
        for(int a = 0; a<mineGrid.length;a++)
        {
            for(int b = 0;b<mineGrid[a].length;b++)
            {
                if(numberGrid[a][b] == 9)
                {
                    for(int i = a-1;i<=a+1;i++)
                    {



                        for(int k = b-1;k<=b+1;k++)
                        {
                            if(numberGrid[a][b] ==9)
                            {
                                if(inBounds(i,k) && numberGrid[i][k]!=9)
                                {
                                    numberGrid[i][k]++;
                                }

                            }

                        }
                    }
                }
            }
        }



    }

    public void printNumberGrid(){
        for(int r = 0; r<mineGrid.length;r++)
        {
            for(int c = 0;c<mineGrid[r].length;c++)
            {
                System.out.print(numberGrid[r][c] + " ");
            }
            System.out.println();
        }

    }

    /** This method returns the total number of mines in the grid.
     */
    public int getMineCount() {
        int num = 0;
        for (int r = 0; r < mineGrid.length; r++) {
            for (int c = 0; c < mineGrid[r].length; c++) {
                if (mineGrid[r][c]) {
                    num++;
                }
            }

        }

        return  num;

    }

    /** This method will return true when [row][col] is a valid location on the matrix.
     * @param row
     * @param col
     */
    private boolean inBounds(int row, int col){
        if(row>=0 && rows< numberGrid.length&& cols>=0 &&cols<numberGrid[0].length)
        {
            return true;
        }

            return false;

    }


    public String toString(){
        String output = "";
        int num = getMineCount();
        output+= "Total number of mines is " + num;
        return output;
    }

}

class MinesweeperTester {
    public static void main(String[] args) {
        //Write code to test your program here
        //
        Minesweeper j = new Minesweeper(10,10);
        System.out.println("Boolean Grid: ");
        j.printBooleanGrid();

        System.out.println();


        System.out.println("Number Grid: ");
        j.setNumberGrid();
        j.printNumberGrid();
        j.getMineCount();

        System.out.println(j);

    }
}
