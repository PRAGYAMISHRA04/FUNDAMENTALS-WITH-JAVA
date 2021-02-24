class SumOfAll{ 
        public static void main(String args[])
            { int i=12,sum=0;
                 // excluding 10 and 50
               for(;i<50;i+=3)
                             sum+=i;
              System.out.println(" Sum of numbers between 10 and 50 "+sum);
            }
}