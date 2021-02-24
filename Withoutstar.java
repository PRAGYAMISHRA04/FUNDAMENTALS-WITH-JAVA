class Withoutstar{ 
          public static void main(String args[])
       {    int a,b,c=0,i=1;
             a=Integer.parseInt(args[0]);
             b=Integer.parseInt(args[1]);
            if(a<b)
                for(;i<=a;i++,c+=b);
            else
                for(;i<=b;i++,c+=a);
             System.out.println(a+" * "+b+" = "+c);
}}        