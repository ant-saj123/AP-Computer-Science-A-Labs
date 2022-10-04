public class DistanceTester {

    private int[][] homeGrid;
    private int[][] distances;
    private Home home;

    public DistanceTester() {
        this.homeGrid = new int[10][10];
        this.distances = new int[10][10];
        this.home = new Home(10,10);
        homeGrid[home.getHomeRow()][home.getHomeCol()] = 99;

        System.out.println("Home Grid");
        printMatrix(homeGrid);
    }

    /** This method traverses the distances matrix and assigns each element the distance from home.
     * You should use the Home class method getDistanceFromHome() in your implementation.
     * The method should call printMatrix(distances) to display the matrix.
     */
    public void assignDistances(){
      for(int r = 0; r < distances.length;r++)
      {
          for(int c = 0; c < distances[r].length;c++ )
          {
            distances[r][c] =   home.getDistanceFromHome(r,c);
          }
      }


        printMatrix(distances);
    }


    /** Returns the largest value in the distances matrix.
     *
     */

    public int findMaxDistanceFromHome(){
        int maxDistance = distances[0][0];
        for(int r = 0; r<distances.length;r++)
        {
            for(int c = 0; c<distances.length;c++)
            {
                if(distances[r][c] > maxDistance)
                {
                    maxDistance = distances[r][c];
                }
            }
        }



        return maxDistance;
    }

    /** This method should determine where in the matrix the max distance is located.
     * Upon finding the location of the max distance,
     * insert the element num at that location in the nums array.
     * Hint: you need to keep track of the row and col where the largest is located.
     * @param num - the number to be inserted.
     */
    public void insertAtMaxDistance(int num){
     int nu = findMaxDistanceFromHome();

     for(int r = 0; r<distances.length;r++)
     {
         for(int c= 0; c<distances.length;c++)
         {
             if(nu == distances[r][c])
             {
                 homeGrid[r][c] = num;
             }
         }
     }



        printMatrix(homeGrid);
    }



    /** Displays a matrix.
     */
    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int n : row)
                System.out.format("%4s",n+ " ");
            System.out.println();
        }

    }


    public static void main(String[] args) {

        DistanceTester app = new DistanceTester();
        System.out.println("\nDistances: ");
        app.assignDistances();
        System.out.println("Max Distance: " + app.findMaxDistanceFromHome());
        System.out.println("\nInsert 77 at max distance: ");
        app.insertAtMaxDistance(77);

    }
}