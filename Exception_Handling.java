import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		char choice='Y';
		Scanner sc=new Scanner(System.in);
		while(choice=='Y'){
		    
		    try{ 
		    System.out.println("Enter number 1/2/3/4");
		    
		    int ch=sc.nextInt();
		    switch(ch){
		        case 1 : { try{ 
		                        int a=5/0;
		                       } 
		                 catch(ArithmeticException E)
		                      {
		                        int a=5/1; 
		                        System.out.println(E);
		                        System.out.println(a);
		                      }
		                  break;
		                  }
		        case 2 : { int[] a=new int[5];
		                      try{ 
		                       a[5]=5;
		                       } 
		                 catch(ArrayIndexOutOfBoundsException E)
		                      {
		                         a[0]=5; 
		                        System.out.println(E);
		                        System.out.println(a[0]);
		                      }
		                  break;
		                  }
		        case 3 : { String b="try";
		                   int c=0;
		                    System.out.println("Enter 1/2");
		                        c=sc.nextInt();
		                       try{ 
		                        
		                       
		                        if(c==1)
		                        {System.out.println(b.charAt(8));}
		                       } 
		                 catch(StringIndexOutOfBoundsException E)
		                      {
		                        b="try until you succeed"; 
		                        System.out.println(E);
		                        System.out.println(b);
		                        if(c==2){
		                        System.out.println(b.charAt(-2)+"YOHO");
		                        }
		                      }
		                  catch(RuntimeException E)
		                      {
		                        b="let go";
		                        System.out.println(E);
		                        System.out.println(b);
		                      }
		                  break;
		                  }
		          case 4 : { String s=null;
		                     try{
		                     System.out.println("There you go "+s);
		                      }
		                   catch(NullPointerException E){
		                       s="null";
		                       System.out.println("There you go "+s);
		                       System.out.println("Enter 1.34/2.41/abc");
		                       
		                       s=sc.nextLine();
		                       int a=Integer.parseInt(s);
		                   }
		                  catch(NumberFormatException E){
		                      System.out.println(" It is a string damn it "+E);
		                  }
		                 break;
		               }
		           }
       	}
       	catch(Exception E){
       	    System.out.println(" Some wrong input ");
       	}
       	System.out.println(" Enter Y to continue ");
       	choice=sc.next().charAt(0);
		}
		    
}
}