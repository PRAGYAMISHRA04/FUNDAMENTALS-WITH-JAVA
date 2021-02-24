class Basicops{ 
    public static void main(String args[])
   {  int A,B,C;
      A=Integer.parseInt(args[0]);
      B=Integer.parseInt(args[1]);
      C=A+B;
      System.out.println("Addition of "+A+" and "+B+" = "+C);
      C=A*B;
      System.out.println("Multiplication of "+A+" and "+B+" = "+C);
      C=A-B;
      System.out.println("Subtraction of "+B+" from "+A+" = "+C);
      C=A/B;
      System.out.println("Division of "+A+" by "+B+" = "+C);}    
}