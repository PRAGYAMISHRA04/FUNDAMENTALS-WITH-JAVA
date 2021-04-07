import java.util.Scanner;
class rotate{
public static void main(String args[])
{ int i=0,t;
  int[] arr1=new int[3];
 Scanner sc=new Scanner(System.in); 
 System.out.println(" Enter 3 integers for array ");
 while(i<3)
 { arr1[i]=sc.nextInt();
  i++;
  }

   int count=0;
   t = arr1[count%3];
   arr1[count%3]=arr1[(count+1)%3];
   arr1[(count+1)%3]=arr1[(count+2)%3];
   arr1[(count+2)%3]= t;
  

System.out.println(" After rotation : ");
i=0;
 while(i<3)
 { System.out.println(" "+arr1[i]);
  i++;
  }
}
}
