import java.util.Scanner;
class Display{
    public static void main(String[] args) {
         int ROOM;
         Scanner sc = new Scanner(System.in);
         System.out.println(" INPUT ROOM NUMBER : ");
         ROOM= sc.nextInt();
         switch(ROOM) {
         case 604: System.out.println("JAVA PROGRAMMING");
                   break;
         case 605: System.out.println("PYTHON PROGRAMMING");
                   break;
         default:  System.out.println(" !! INVALID !! ");
         }
    }
    }
