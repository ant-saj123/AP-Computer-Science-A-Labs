public class ItemGrid {
    private Item[][] grid;

    public ItemGrid(Item[][] grid){
        this.grid = grid;
    }

    public boolean isValid(int xPos, int yPos){
        return xPos >= 0 && xPos < grid.length && yPos >=0 && yPos < grid[0].length;
    }

    /**Compares the item in row r and column c to the values to  its left and right.
     * returns the name of the item with the highest value.
     */
    public String mostValuableNeighbor(int r, int c){

        Item val = grid[r][c];

        if(isValid(r,c+1) && grid[r][c+1].getValue()>val.getValue())
        {
            val = grid[r][c+1];
        }
        if(isValid(r,c-1) && grid[r][c-1].getValue()>val.getValue())
        {
            val = grid[r][c-1];
        }


        return val.getName();
    }

    /** Returns the average value of items in the grid.
     */
    public double findAverage(){
        double sum = 0;
        double num = 0;

        for(int r = 0; r < grid.length; r++)
        {
            for(int c = 0; c< grid[r].length; c++)
            {
                sum += grid[r][c].getValue();
                num++;
            }
        }

        return sum/(double)num;
    }



    public void printGrid(){
        for(Item[] row: grid){
            for(Item i : row){
                System.out.format("%12s",i.getName() +"-" + i .getValue());
            }
            System.out.println();
        }
    }
}

class Item{
    private String name;
    private int value;

    public Item(String itemName, int itemValue){
        this.name = itemName;
        this.value = itemValue;
    }

    public String getName(){
        return name;
    }
    public int getValue(){
        return value;
    }
}

class ItemGridTester {
    public static void main(String[] args) {
        Item[][] grid = {{new Item("Acorn", 7), new Item("Book", 10), new Item("Carrot", 8), new Item("Desk", 9) },
                {new Item("egg", 5), new Item("flag", 8), new Item("globe", 8), new Item("harp", 9)},
                {new Item("island", 7), new Item("jacket", 19), new Item("kale", 8), new Item("lunch", 16)},
        };

        ItemGrid app = new ItemGrid(grid);
        app.printGrid();
        System.out.println(app.mostValuableNeighbor(0,0)); //acorn
        System.out.println(app.mostValuableNeighbor(1,1)); //flag
        System.out.println(app.mostValuableNeighbor(2,2)); //kale

        System.out.println("avg: " + app.findAverage());
    }
}