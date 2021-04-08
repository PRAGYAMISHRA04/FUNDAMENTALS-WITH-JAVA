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
{
	public static void main(String[] args) {
		System.out.println(" ENTER YOUR AGE TO CHECK ELIGIBILITY ");
		int age;
		Scanner SC=new Scanner(System.in);
		age=SC.nextInt();
		
		try{
		    
		    if(age<18){
		        throw new TooYoungException(" Too Young to apply for job ");
		    }
		    else if(age>60){
		        throw new TooOldException(" Too Old to apply for job ");
		    }
	       }
	    catch(TooOldException E){
	        System.out.println(" Too Old to apply for job ");
	    }
	    catch(TooYoungException E){
	        System.out.println(" Too Young to apply for job ");
	    }
}
}