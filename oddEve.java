import java.util.Scanner;

class oddEve{ 
public static void main(String args[])
{  int[] arr=new int[10],sorted= new int[10];
   Scanner sc=new Scanner(System.in);
   System.out.println(" Enter 10 positive integers ");
   int i=0,k=0;
   while(i<10)
          { arr[i]=sc.nextInt();
            i++;
          }
 for(int A:arr)
{ if(A%2==0)
         sorted[k++]=A;
  }
 for(int A:arr)
{ if(A%2!=0)
         sorted[k++]=A;
  }
i=0;
while(i<10)
{ System.out.println(" "+sorted[i]);
  i++;
}
}
}


