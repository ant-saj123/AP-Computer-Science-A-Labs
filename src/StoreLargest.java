public class StoreLargest {
    public static void main(String[] args) {
        int[][] matrix1 = new int[4][4];
        int[][] matrix2 = new int[4][4];

        for(int r = 0; r < matrix1.length; r++)
        {
            for(int c = 0; c < matrix1[r].length; c++)
            {
                matrix1[r][c] = (int)(Math.random()*10);
            }
        }

        for(int r = 0; r < matrix2.length; r++)
        {
            for(int c = 0; c < matrix2[r].length; c++)
            {
                matrix2[r][c] = (int)(Math.random()*10);
            }
        }
        System.out.println("Matrix 1");
        for(int[] arr : matrix1){ //for each int array in matrix

            for(int n : arr)
            {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Matrix 2");
        for(int[] arr : matrix2){ //for each int array in matrix

            for(int n : arr)
            {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        int[][] matrix3 = new int[4][4];

        for(int r = 0; r < matrix3.length; r++)
        {
            for(int c = 0; c < matrix3[r].length;c++)
            {
                if(matrix1[r][c] > matrix2[r][c])
                {
                    matrix3[r][c] = matrix1[r][c];
                }
                else{
                    matrix3[r][c] = matrix2[r][c];
                }
            }
        }

        System.out.println("Largest Elements");
        for(int[] arr : matrix3){ //for each int array in matrix

            for(int n : arr)
            {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
