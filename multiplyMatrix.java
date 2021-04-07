import java.util.Scanner;

class Diagonalele
{  
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 
 int[][] M = new int[3][3];
 
     System.out.println("Enter the elements of the matrix") ;
     for(i=0;i<3;i++)
     { 
      for(j=0;j<3;j++)
      { 
          M[i][j] = sc.nextInt();
     }
 }
 
      System.out.println(" The diagonal elements are :  ") ;
 
     for(i=0;i<3;i++)
     { 
      for(j=0;j<3;j++)
      { 
                    if(i==j) 
                  {
                       System.out.println(" "+M[i][j]);
                    }
      }
     }
 
    
 } 
}


