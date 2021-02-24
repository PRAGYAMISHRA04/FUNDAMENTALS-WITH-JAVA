import java.util.Scanner;
class Swap{ 
  public static void main(String args[])
            {  int a,b;
                   Scanner sc=new Scanner(System.in);
                   System.out.println(" Enter values for a : "); 
                   a=sc.nextInt();
                   System.out.println("Enter values for b : ");
                   b=sc.nextInt();
                   a=a+b;
                   b=a-b;
                   a=a-b;
                   System.out.println(" Values after swapping \n a = "+a+" b = "+b);
                  
             }
}