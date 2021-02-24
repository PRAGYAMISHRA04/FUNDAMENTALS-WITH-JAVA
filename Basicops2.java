import java.util.Scanner;
class Basicops2{
    public static void main(String[] args) {
        int A, B;
        Scanner sc=new Scanner(System.in);
         System.out.println(" Enter two numbers for arithmetic operations ");
         A= sc.nextInt(); // Input using scanner class
         B= sc.nextInt();
  
          A=A+B;
          System.out.println(" Sum = "+ A);
          A=A-2*B;
          System.out.println(" Difference = "+ A);
          A=(A+B)*B;
          System.out.println(" Product = "+ A);
          A=(A/B)/B;
          System.out.println(" Quotient = "+ A);
         }
    }
