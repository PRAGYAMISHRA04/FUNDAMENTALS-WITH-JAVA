import java.util.Scanner;
class theLargerOne
{
public static void main(String args[])
{ 
  int one,two;
 int[] arr=new int[3];
Scanner sc=new Scanner(System.in);
System.out.println(" Enter 3 integers ");

for(int a:arr) 
 { a=sc.nextInt();
 }
 one=arr[0];
 two= arr[2];

 if(one > two)
{
  System.out.println(" Its the 1st one : "+one);
}
 else if( two > one)
{
  System.out.println(" Its the 2nd one : "+two);
}
else
{  System.out.println(" They are same !!");
}

}
}
