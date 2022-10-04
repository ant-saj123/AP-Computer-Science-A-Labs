public class Home {
    private int homeRow;
    private int homeCol;

    public Home(int rows, int cols) {
        this.homeRow = (int)(Math.random()*rows);
        this.homeCol = (int)(Math.random()*cols);
    }

    /* finds the manhattan distance between [homeRow][homeCol] and [row][col]
        Manhattan Distance = abs(x2-x1) + abs(y2-y1)
     */
    public int getDistanceFromHome(int row, int col){
        return Math.abs(row-homeRow) + Math.abs(col-homeCol);
    }

    public int getHomeRow() {
        return homeRow;
    }
    public int getHomeCol() {
        return homeCol;
    }
}

