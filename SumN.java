class SumN{ 
   public static void main(String args[]){
        int N=Integer.parseInt(args[0]);
        int i=1,sum=0;
        for(;i<N;sum+=i,i++);
        System.out.println(" Sum of first "+N+" integers "+sum);
       }
}