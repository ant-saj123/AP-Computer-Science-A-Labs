public class CellCounter {
    private char[][] matrix;
    private boolean[][] visited;


    public CellCounter() {
        matrix = new char[][]{{'@', '-', '@', '-', '-', '@', '-', '@', '@', '@'},
                {'@', '@', '@', '-', '@', '@', '-', '@', '-', '@'},
                {'-', '-', '-', '-', '-', '-', '-', '@', '@', '@'},
                {'-', '@', '@', '@', '@', '@', '-', '@', '-', '@'},
                {'-', '@', '-', '@', '-', '@', '-', '@', '-', '@'},
                {'@', '@', '@', '@', '@', '@', '-', '@', '@', '@'},
                {'-', '@', '-', '@', '-', '@', '-', '-', '-', '@'},
                {'-', '@', '@', '@', '-', '@', '-', '-', '-', '-'},
                {'-', '@', '-', '@', '-', '@', '-', '@', '@', '@'},
                {'-', '@', '@', '@', '@', '@', '-', '@', '@', '@'}};

        visited = new boolean[matrix.length][matrix[0].length];
    }

    private boolean isValid(int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }

    public int countCells(int r, int c) {
int sum = 0;
        if (isValid(r, c) && !visited[r][c]) {
            visited[r][c] = true;
            if (matrix[r][c] == '@') {
                sum = 1 + countCells(r - 1, c)//check above neighbor
                        + countCells(r + 1, c)//check below neighbor
                        + countCells(r, c + 1) // check right neighbor
                        + countCells(r, c - 1);

            }
        }
        return sum;
    }


        /*
         *this method will return all values in the matrix
         *this method should return a view of the matrix
         *that looks like a matrix
         */
        public String toString()
        {
            String output = "";
            for (int a = 0; a < matrix.length; a++) {
                for (int b = 0; b < matrix.length; b++) {
                    output += matrix[a][b] + " ";
                }
                output += "\n";
            }

            return output;
        }


    }

     class CellCounterRunner {
        public static void main(String args[]) {
            //instantiate an AtCounter
            CellCounter c = new CellCounter();
            System.out.println(c);
            //test the code
            System.out.println("0 0 has " + c.countCells(0, 0) + " @s connected.");
            System.out.println("0 8 has " + c.countCells(5, 0) + " @s connected.");

            //add more test cases
        }
    }

