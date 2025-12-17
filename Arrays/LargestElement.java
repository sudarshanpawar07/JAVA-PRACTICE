import java.util.*;
class LargestElement{
	public static void main(String[] args) {

		int [] arr = new int[20];

		for (int i =0; i < arr.length ;i++ ) {
			arr[i] = (int ) (Math.random() * 100);
			
		}

		Arrays.sort(arr);
		int max = largest(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("max : " + max); // second largest unsorted
		
	}
	public static int largest(int [] arr)
	{
		int max1 = arr[arr.length-1];
		

		for(int i = arr.length-2; i>=0;i--)
		{
			
			if(arr[i] != max1)
			{
				return arr[i];
			}
		}

		return max1;
	}

}