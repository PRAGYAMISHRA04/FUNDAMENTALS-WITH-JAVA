package italia;
import java.util.*;


public class order {
	Map<String,String> map=new HashMap<String,String>();
	//ArrayList<HashMap<String,String>> L=new ArrayList<HashMap<String,String>>();
	order(){
		Scanner sc=new Scanner(System.in);
		System.out.print(" ENTER TABLE NO.: ");
		map.put("\n\t\t\t Table Number : ",sc.nextLine());
		System.out.print(" ENTER THE CUSTOMER NAME : ");
		map.put("\n\t\t\t Table Number : ",sc.nextLine());
		Menu m=new Menu();
		System.out.println(" ENTER ITEMS (enter DONE to STOP) : ");
		int k=1;
		String ord=sc.nextLine().trim();
		while("DONE".equalsIgnoreCase(ord)!= true){
			for(Map.Entry<String,Float> item : m.getItems().entrySet()) {
	             	if(ord.equalsIgnoreCase(item.getKey().trim())==true) {
	                      map.put("\n\t\t\t Item : "+k,"  "+item.getKey()+"   "+item.getValue());
	                }
		    }
			ord=sc.nextLine();
			k++;
	   }
		sc.close();
		System.out.println(" THANK YOU FOR CHOOSING ITALIA !!");
}
	
	
	Map<String,String> getOrder(){
	       return map;
    }
	public static void main(String args[]) {
		order n=new order();
		Map<String,String> order1=n.getOrder();
		for(Map.Entry<String,String> orderi:order1.entrySet()) {
			System.out.println(" "+orderi.getKey()+orderi.getValue());
		}
	}
}
