
class SwapFirstLast {
 public static void main(String[] args)
 {
    int[] arr= {20, 30, 40};
	System.out.println("Initial array: "+Arrays.toString(arr)); 
	int one = arr[0];
	arr[0] = arr[arr.length-1];
	arr[arr.length-1] = one;
	System.out.println(" Swapped array"+Arrays.toString(arr));  
 }
}

