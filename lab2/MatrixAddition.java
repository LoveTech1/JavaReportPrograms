package lab2;

// program to perfrom matrix addtion

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args){
        int i,j;
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];
        int[][] sum = new int[2][2];
        Scanner obj = new Scanner(System.in);

        // for matrix A input
        System.out.println("-------For matrix A ----------");
        for(i = 0;i<2;i++){
            for(j=0;j<2;j++)
            {
                System.out.println("Enter elements index " + i + j);
                matrixA[i][j] = obj.nextInt();
            }
        }

        // for matrix B input
        System.out.println("-------For matrix B ----------");
        for(i = 0;i<2;i++){
            for(j=0;j<2;j++)
            {
                System.out.println("Enter elements index " + i + j);
                matrixB[i][j] = obj.nextInt();
            }
        }

        // for sum of matrix
        for(i = 0;i<2;i++){
            for(j=0;j<2;j++)
            {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // for displaying of matrix
        for(i = 0;i<2;i++){
            for(j=0;j<2;j++)
            {
                System.out.print(sum[i][j] + " ");
                if(j == 1){
                    System.out.println( );
                }
            }

        }

    }
}
