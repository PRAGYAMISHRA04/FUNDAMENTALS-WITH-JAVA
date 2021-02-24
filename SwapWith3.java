import java.util.Scanner;
public class SwapWith3{
    public static void main(String[] args) {

         int a, b, c;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a = ");
         a= sc.nextInt();
         System.out.println("Enter b = ");
         b= sc.nextInt();
         c=b;
         b=a;
         a=c;
         System.out.println(" Swapped values of a and b : "+ a + " " + b);
         }
    }

