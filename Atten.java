class Sum{
 static int sumOf(int a ,int b,int c,int d)
 { int sum=0;
   int[][] A=new int[2][2];
  A[0][0]=a;A[0][1]=b;A[1][0]=c;A[1][1]=d;
  int i,j;
 for(i=0;i<2;i++)
   {for(j=0;j<2;j++)
         { sum+=A[i][j];
          }
   }
System.out.println(" Returning through 1st function");
return sum;
  }
static float sumOf(float a ,float b,float c,float d)
 { float sum=0;
   float[][] A=new float[2][2];
  A[0][0]=a;A[0][1]=b;A[1][0]=c;A[1][1]=d;
  int i,j;
 for(i=0;i<2;i++)
   {for(j=0;j<2;j++)
         { sum+=A[i][j];
          }
   }
System.out.println(" Returning through 2nd function");
return sum;
  }

public static void main(String args[])
{ System.out.println(" The numbers entered are : 1 2 3 4 ");
    System.out.println(sumOf(1,2,3,4));
    System.out.println(sumOf(1.0,2.0,3.0,4.0));
}
