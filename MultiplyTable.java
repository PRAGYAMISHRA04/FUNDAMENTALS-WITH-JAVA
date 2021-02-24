class MultiplyTable{ 
  public static void main(String args[])
   {    int i,j,b;
       for(i=1;i<=15;i+=1)
          {  System.out.println(" Table of  "+i);
              b=i;
              for(j=1;j<=10;j+=1)
              {  System.out.println(i+" * "+j+" = "+b);
                 b+=i;
              }
           }
         }
}