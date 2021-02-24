import java.lang.Math;
class ArmstrongNums{ 
         public static void main(String args[]){
                    int r=0,x,X;
                    X=Integer.parseInt(args[0]);
                    x=X;
                while(x>0)
               { r+=Math.pow((x%10),3);
                  x=x/10;
                  }
                if(r==X)
                        System.out.println(X+" is an Armstrong Number ");
                else
                       System.out.println(X+" is not an Armstrong Number ");

       }
}