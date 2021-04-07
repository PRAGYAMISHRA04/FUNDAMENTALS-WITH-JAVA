import java.util.Scanner;

class sortInt{
public static void main(String args[]){
int[] arr=new int[10],sorted= new int[10];
Scanner sc=new Scanner(System.in);
System.out.println(" Enter 10 positive integers ");

int i=0,j,k,store1,store2;
while(i<10)
{ arr[i]=sc.nextInt();
  i++;
 }

for(k=0;k<10;k+=2)
  {    store1=0;
        for(i=1;i<10;i++)
           {     if(arr[i] > arr[store1] && arr[i]!=-1)
                      store1=i;
            }
        sorted[k]=arr[store1];
       arr[store1]=-1;
       if(arr[0]!=-1) 
                 store2=0;
       else
              { int g=0; 
                while(arr[g]==-1)
                    { g++;
                     }
                store2=g;
                };                   
       for(j=1;j<10;j++)
            {  if(arr[j]< arr[store2] && arr[j]!=-1)
                   store2=j;
            }
       sorted[k+1]=arr[store2];
      arr[store2]=-1;
   }
i=0; 

System.out.println(" Sorted array :- ");   
while(i<10)
{ System.out.println(" "+sorted[i]);
  i++;
 }
}
}

