class OddDivBy5{
    public static void main(String[] args) {
         int i;
         for(i = 200; i <= 800; i++)
         {
             if(i % 5 == 0  &&  i % 2 == 1 )
                   System.out.println(i + " ");
         }
         System.out.println("\n");
    }
    }
