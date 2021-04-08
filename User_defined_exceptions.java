import java.util.Scanner;

class TooYoungException extends Exception{
    TooYoungException(String s){
        super(s);
    }
}
class TooOldException extends Exception{
    TooOldException(String s){
        super(s);
    }
}


    public class User_defined _exceptions
{        static void validate1(int age) throws TooYoungException{
                if(age<18){
		        throw new TooYoungException(" Too Young to apply for job ");
		    }
           }
	static void validate2(int age) throws TooOldException{
	   if(age>60){
		        throw new TooOldException(" Too Old to apply for job ");
		    }
         }
	public static void main(String[] args) {
		System.out.println(" ENTER YOUR AGE TO CHECK ELIGIBILITY ");
		int age;
		Scanner SC=new Scanner(System.in);
		age=SC.nextInt();
		
		try{
		    
		  validate1(age);
	          validate2(age);
	       }
	    catch(TooOldException E){
	        System.out.println(" Too Old to apply for job ");
	    }
	    catch(TooYoungException E){
	        System.out.println(" Too Young to apply for job ");
	    }
}
}
