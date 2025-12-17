import java.util.*;
class LinearSearch {
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		System.out.println("Array : " + Arrays.toString(arr));

		System.out.println("Element to find in an Array : ");
		int key = new java.util.Scanner(System.in).nextInt();

		int i = 0;
		while(i < arr.length){

			if(arr[i] == key)
			{
				break;
			}
			i++;

		}
		if(i == arr.length){
			System.out.println("Element not found.");
		}else{
			System.out.println("Element found at " + i + " index.");
		}
		
	}
	
}