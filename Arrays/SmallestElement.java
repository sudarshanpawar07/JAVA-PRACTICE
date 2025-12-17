import java.util.*;
class SmallestElement{
	public static void main(String[] args) {

		int [] arr = new int[20];

		for (int i =0; i < arr.length ;i++ ) {
			arr[i] = (int ) (Math.random() * 100);
			
		}

		// Arrays.sort(arr);
		int secondMin = SecondSmallest(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("Second Min  : " +secondMin); // second smallest unsorted
		
	}
	public static int SecondSmallest(int [] arr)
	{
		int min1 = Integer.MAX_VALUE;
		int min2 = 0;
		

		for (int ele : arr) {
			if(min1 > ele)
			{
				min2 = min1;
				min1 = ele;
			}
			
		}

		return min2;
	}

}