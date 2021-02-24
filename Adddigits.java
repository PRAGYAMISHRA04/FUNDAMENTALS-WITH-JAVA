import java.util.Scanner;

class  Adddigits{  

public static void main(String args[])
{            int A,sum;
             char ch='Y';
            Scanner sc=new Scanner(System.in);  
           A=Integer.parseInt(args[0]);
             while(ch=='Y')
          {  
            if(Adddigits.calSum(A)!=-1)
                System.out.println("Sum of 4 - digit numbers "+Adddigits.calSum(A));
             System.out.println(" Wait ! Want to input different number (Y/N) ?");
             ch=sc.next().charAt(0);
              if(ch=='Y')
                  A=sc.nextInt();
                }
}
              public static int calSum(int X)
              { int sum=0,i=0;
                   while(X>0 && i++<4)
                           {  sum+=X%10;
                             X=X/10;
                                 }
                   if(i==5)
                        { System.out.println(" Not a 4 digit number"); return -1;}
                        return sum;
                  }
}