import java.util.Scanner;
class CalPower{
    public static void main(String[] args) {

         int BASE, POWER,i=0;
         long STORE= 1;
         Scanner sc = new Scanner(System.in);
         System.out.println(" ENTER BASE ");
         BASE = sc.nextInt();
         System.out.println(" ENTER POWER - ");
         POWER= sc.nextInt();
         while (i < POWER)
         {
            STORE *= BASE;
            i++;
         }
         System.out.println(BASE+" ^ "+POWER+" = " + STORE);
         }
    }
