import java.util.Scanner;
class binToDec{
  public static void main(String[] args) {
     long binin, rem1;   
     int decout = 0, i = 0;
     Scanner sc=new Scanner(System.in);
     System.out.println(" Enter the Binary number ");
     binin = sc.nextLong();
    
     while (binin != 0) {
      rem1 = binin % 10;
      binin /= 10;
      decout += rem1 * Math.pow(2, i);
      ++i;
    }

    System.out.println(" Decimal  : "+decout);
  
    long binout=0;
    int rem2,decin, j = 1;
   
    System.out.println(" Enter the Decimal number ");
    decin=sc.nextInt();
    
   while (decin!=0) {
      rem2 = decin % 2;
        decin /= 2;
        binout += rem2 * j;
        j *= 10;
    }

    System.out.println(" Binary  : "+binout);
 
}
} 
