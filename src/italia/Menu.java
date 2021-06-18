package italia;

import java.util.HashMap;
import java.util.Map;

public class Menu{
	Map<String,Float> map=new HashMap<String,Float>();
	Menu(){
	
	map.put(" Pizza ",300f);
	map.put(" Burger ",250f);
	map.put(" Pizza Mexicano ",500f);
	map.put(" Pizza Cheese Burst ",500f);
	map.put(" Pizza Veggies ",450f);
	map.put(" Pasta Italiano ",400f);
	map.put(" Paneer Pizza ",400f);
	map.put(" Pizza Oivlia ",550f);
	map.put(" Pizza Pepper ",500f);
	map.put(" Pasta Pink Sauce ",480f);
	map.put(" Pasta Red Sauce ",480f);
	map.put(" Pasta White Sauce ",480f);
	map.put(" Garlic Bread With Cheese Dip ",100f);
	
		System.out.print("\t\t\t------------------------------------------------------"); 
		System.out.println("\n\t\t\t                           MENU ");
        System.out.println("\t\t\t------------------------------------------------------");
        int i=1;
        for(Map.Entry<String,Float> m:map.entrySet()) {
        	System.out.println(" \t\t\t     "+i+". "+m.getKey()+"    "+m.getValue()+" Rs ");
            i++;
        }
	} 
	
	public static void main(String args[]) {
		Menu n=new Menu();
		
	}
	
	public Map<String,Float> getItems(){
		return map;
	}
	}



