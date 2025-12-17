import java.util.*;
// class MaxElement
// {
// 	public static void main(String[] args) {
// 		int [] arr = new int[20];

// 		for (int i = 0;i < arr.length ;i++ ) arr[i] = (int) (Math.random() * 100);

// 		System.out.println(Arrays.toString(arr));

// 		int max = Integer.MIN_VALUE;

// 		for (int ele : arr ){

// 			if(max < ele ) max = ele;

			
// 		}
// 		System.out.println(max); // unsorted 


// 	}
// }

class MaxElement
{
	public static void main(String[] args) {
		int [] arr = new int[20];

		for (int i = 0;i < arr.length ;i++ ) arr[i] = (int) (Math.random() * 100);
		Arrays.sort(arr);
		

		System.out.println(Arrays.toString(arr));


		int max = Integer.MIN_VALUE;


		for (int ele : arr ){

			if(max < ele ) max = ele;

			
		}
		System.out.println(max); // unsorted 


	}
}