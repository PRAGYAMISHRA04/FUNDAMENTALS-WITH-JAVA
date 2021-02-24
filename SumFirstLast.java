import java.util.Scanner;
class SumFirstLast{
    public static void main(String[] args) {

         int NUM,FIRSTDIG=0,LASTDIG=0,SUM;
         Scanner sc = new Scanner(System.in);
         System.out.println(" Input number");
         NUM= sc.nextInt();
         LASTDIG=NUM%10;
         NUM=NUM/10;
         while(NUM!=0)
         {
            FIRSTDIG=NUM%10;
            NUM=NUM/10;
         }
         SUM=FIRSTDIG+LASTDIG;
         System.out.println("SUM OF 1ST AND 4TH DIGIT = "+ SUM);
         }
    }

