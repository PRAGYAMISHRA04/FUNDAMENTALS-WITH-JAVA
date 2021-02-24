import java.util.Scanner;
class CheckDiv{ 
   public static void main(String args[]){
     int x;    
     x=Integer.parseInt(args[0]);
     char ch='Y';
    Scanner sc=new Scanner(System.in);
         while(ch=='Y')
      { if(x%3==0 && x%5==0)
               System.out.println(x+" is divisible by 3 and 5 ");
        else
              System.out.println(x+" is not divisible by 3 and 5 ");
        System.out.println(" Do you want to check for another number (Y/N) ?");
        ch=sc.next().charAt(0);
         if(ch=='Y')
                 x=sc.nextInt();
        }
     }
}