import java.util.*;
// class BubbleSortExample{
// 	public static void main(String[] args) {
// 		String [] arr = {"RAMESH","MAHESH","GANESH","SURESH","MUKESH"};
// 		System.out.println(Arrays.toString(arr));

// 		bubbleSort(arr,arr.length);
// 		System.out.println(Arrays.toString(arr));
// 	}
// 	public static void bubbleSort(String []arr, int n)
// 	{

// 		for(int i = 0; i< n-1;i++)
// 		{
// 			for (int j = i+1;j < n ;j++ ) {
// 				if(arr[i].compareTo(arr[j]) > 0)
// 				{
// 					String temp = arr[j];
// 					arr[j] = arr[i];
// 					arr[i] = temp; 
// 				}
				
// 			}
// 		}

// 	}
// }

// class BubbleSortExample{
// 	public static void main(String[] args) {
// 		String [] arr = {"RAMESH","MAHESH","GANESH","SURESH","MUKESH"};
// 		System.out.println(Arrays.toString(arr));

// 		bubbleSort(arr,arr.length);
// 		System.out.println(Arrays.toString(arr));
// 	}
// 	public static void bubbleSort(String []arr, int n)
// 	{

// 		for(int i = 0; i< n-1;i++)
// 		{
// 			for (int j = i+1;j < n ;j++ ) {
// 				if(arr[i].compareTo(arr[j]) < 0)
// 				{
// 					String temp = arr[j];
// 					arr[j] = arr[i];
// 					arr[i] = temp; 
// 				}
				
// 			}
// 		}

// 	}
// }


class BubbleSortExample{
	public static void main(String[] args) {
		//String [] arr = {"RAMESH","MAHESH","GANESH","SURESH","MUKESH"};
		int [] arr = {9,8,6,4,3,5,2,1};
		System.out.println(Arrays.toString(arr));

		bubbleSort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	public static void bubbleSort(int []arr, int n)
	{

		for(int i = 0; i< n -1;i++)
		{
			for (int j = i+1;j < n ;j++ ) {
				if(arr[i] > arr[j])
				{
					int  temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp; 
				}
				
			}
		}

	}
}