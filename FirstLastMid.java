import java.util.*;
 public class MulArrays{
     public static void main(String[] args){	
	   String mul= "";
	   int[] arr1= {1, 3, -5, 4};
	   int[] arr2 = {1, 4, -5, -2};
	   System.out.println("\nArray1: "+Arrays.toString(arr1));  
	   System.out.println("\nArray2: "+Arrays.toString(arr2)); 
                        for (int i = 0; i < arr1.length; i++) {
				int one = arr1[i];
				int two = arr2[i];
				mul += Integer.toString(one * two) + " "; 
			}
		System.out.println("\n After Multiplication : "+mul);     
	 }			
}


