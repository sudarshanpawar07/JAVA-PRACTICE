import java.util.*;
// class ReverseArray{
// 	public static void main(String[] args) {
// 		int [] arr = {10,20,30,40,50};
// 		System.out.println(Arrays.toString(arr));

// 		int i = 0;
// 		int j = arr.length-1;
// 		while(i < j)
// 		{
// 			int temp = arr[i]; // time complexity O(n)
// 			arr[i] = arr[j];
// 			arr[j] = temp;
// 			i++;
// 			j--;

// 		}

// 		System.out.println(Arrays.toString(arr));

// 	}
	
// }

class ReverseArray{
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));

		int i = 0;
		int j = arr.length-1;
		while(i < j)
		{
			int temp = arr[i]; // time complexity O(n/2)
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;

		}

		System.out.println(Arrays.toString(arr));

	}
	
}