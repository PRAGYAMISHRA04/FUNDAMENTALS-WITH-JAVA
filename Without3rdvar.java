/*Write a Java program to perform operation (Addition, Subtraction, Multiplication, Division) without using third variable.*/

class Without3rdvar{ 
            public static void main(String args[])
        { int a,b;
           a=Integer.parseInt(args[0]);
           b=Integer.parseInt(args[1]);
           System.out.println(a+" + "+b+" = ");
           a=a+b;
           System.out.println(a);
       }
}