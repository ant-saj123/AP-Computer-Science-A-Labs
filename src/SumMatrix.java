import java.util.Scanner;
public class SumMatrix {
    public static void main(String args[]) {
        Scanner jonny = new Scanner(System.in);
        System.out.print("Enter matrix row size--> ");
        int row = jonny.nextInt();
        System.out.print("Enter matrix column size--> ");
        int column = jonny.nextInt();
        int[][] matrix = new int[row][column];

        for(int r = 0; r<matrix.length;r++){ //for each int array in matrix
            int rsum = 0;


            for(int c = 0; c < matrix[r].length;c++)
            {
                matrix[r][c] = (int)(Math.random()*10);
                 rsum = rsum + matrix[r][c];
                System.out.print(matrix[r][c] + " ");



            }
            System.out.print("  " + rsum);
            System.out.println();
        }


        System.out.println();
        System.out.println();
        for(int c = 0; c < matrix[0].length; c++)
        {
          int  num = 0;
            for(int r = 0; r < matrix.length; r++)
            {
                num = num +  matrix[c][r];
            }
            System.out.print(num + " ");
        }

    }


}


