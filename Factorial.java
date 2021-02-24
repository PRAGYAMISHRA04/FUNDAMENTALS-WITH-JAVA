import java.util.Scanner;
class Factorial{ 
           public static void main(String args[]){
                    int x;
                    Scanner sc=new Scanner(System.in);
                    x=sc.nextInt();
                    int store,X=1;
                    store=x;
                    while(x>0)
                 { X*=x;
                    x--;
                  }
                  System.out.println("Factorial of "+store+" is "+X);
                 }
}
