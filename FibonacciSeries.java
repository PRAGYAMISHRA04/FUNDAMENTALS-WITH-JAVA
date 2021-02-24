class FibonacciSeries{
    public static void main(String[] args) {
          int F1=0,F2=1, F3, i, LIMIT=20;    
          System.out.print(F1+" "+F2);    
          for(i=2;i<LIMIT;++i)    
          {    
            F3=F1+F2;    
            System.out.println(" "+F3);    
            F1=F2;    
            F2=F3;
         }
         System.out.println(" ");
         }
    }

