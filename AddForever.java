import java.util.Scanner;

class AddForever{
    public static void main(String[] args) {
 int A, B, SUM=0;
         char ch='Y';
         do {
         Scanner sc=new Scanner(System.in);
         System.out.println(" ENTER 2 NUMBERS ");
         A=sc.nextInt();
         B=sc.nextInt();
         SUM=A+B;
         System.out.println("Sum = "+ SUM);
         System.out.println(" Choose to enter again? (Y/N)");
         ch= sc.next().charAt(0);         
         }while(ch == 'Y');
    
    }
}
