import java.util.Scanner;
class MutiplyTableN{ 
   public static void main(String args[])
{  Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    System.out.println(" Table of "+N);
    int i=0,mul=0;
    for(;i<=10;i++,mul+=N)
        System.out.println(N+" * "+i+" = "+mul);
    }
}