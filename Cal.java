import java.util.Scanner;
import java.io.*;

public class Cal implements sumn,factorialn {

   public void sumOf(){ 
    Scanner sc=new Scanner(System.in);
    int sum=0;   
    int[] arr=new int[10];
   System.out.println(" Enter numbers to find sum");
       for(int a:arr)
          { a=sc.nextInt();
             sum+=a;
          }
   System.out.println(" SUM = "+sum);
sc.close();
   }

   public void factOf(){ 
    Scanner sc=new Scanner(System.in);
    int fac,fact=1;   
    System.out.println("Enter the number " );
     fac=sc.nextInt();
      while(fac>1)
{  fact=fact*fac;
     fac--;
 }
sc.close();
   System.out.println(" FACTORIAL  = "+fact);
   }


  public static void main(String args[]){ 
    Cal c=new Cal();
    c.sumOf();
    c.factOf();
}
}


interface sumn{ 
void sumOf() ;
}

interface factorialn { 
void factOf();
} 
