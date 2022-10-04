public class NumberCube {
    /** Return an integer value between 1 and 6 inclusive.
     *
     */
    public int toss() {
        //Doesn't matter how this works, all we know is what the method returns and we must use it in our solution.
        return (int)(Math.random()*6)+1;
    }
}

class NumberCubeMethods {


    /** Returns an int array of the values obtained by tossing a number cube numTosses times.
     * @param cube a number cube object
     * @param numTosses the number of tosses to be recorded.
     */
    public static int[] getCubeTosses(NumberCube cube, int numTosses){

        int[] tosses = new int[numTosses];
        for(int i = 0; i < numTosses; i++)
        {
            tosses[i] = cube.toss();
        }

        return tosses;

    }


    /**Returns the starting index of a run of two or more consecutive repeated values.
     *
     * @param values
     * @return index of longest run
     */
    public static int getLongestRun(int[] values){
        int longestRun = 0;
        int currentRun = 0;
        int startingIndex = -1;
        for(int i = 0; i<values.length-1;i++)
        {
            if(values[i] == values[i+1])
            {
                currentRun++;
                if(currentRun > longestRun)
                {
                    longestRun = currentRun;
                    startingIndex = i - currentRun+1;
                }
            }
            else
            {
                currentRun = 0;
            }
        }
        return startingIndex;
    }

    public static int getLongestRun2(int[] values)
    {
        int longestRun = 0;
        int currentRun = 0;
        int startingIndex = -1;
        for(int i = values.length-2; i >= 0; i--)
        {
            if(values[i] == values[i+1])
            {
                currentRun++;
                if(currentRun >= longestRun)
                {
                    longestRun = currentRun;
                    startingIndex = i;
                }
            }
            else
            {
                currentRun = 0;
            }
        }

        return startingIndex;
    }


    public static void main(String[] args) {
        int[] nums = {1,5,5,4,3,1,2,2,2,2,6,1,3,3,5,5,5,5};
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("longest run index: " + getLongestRun(nums));
        System.out.println("longest run index: " + getLongestRun2(nums));
    }

}