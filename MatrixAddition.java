import java.io.*;
import java.util.Scanner;

class MatrixAddition{
 
    public static void main(String[] args)
    {
         int[][] A= new int[3][3],B= new int[3][3],RES=new int[3][3];
        int i,j;
 Scanner sc=new Scanner(System.in);

        System.out.println("\n Enter numbers in Matrix A:");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
                A[i][j]=sc.nextInt();
        }
 
      System.out.println("\n Enter numbers in Matrix B:");
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++)
                B[i][j]=sc.nextInt();
        }

        System.out.println("\nResultant Matrix:");

   for ( i = 0; i < 3; i++) {
          System.out.println("\n");
            for (j = 0; j < 3; j++)
              {  RES[i][j]=A[i][j]+B[i][j];
                 System.out.print(" "+RES[i][j]);
        }
}

  
    }
}
