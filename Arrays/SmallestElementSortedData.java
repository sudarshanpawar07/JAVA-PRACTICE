import java.util.*;
class SmallestElementSortedData{
	public static void main(String[] args) {

		int [] arr = new int[20];

		for (int i =0; i < arr.length ;i++ ) {
			arr[i] = (int ) (Math.random() * 100);
			
		}

		Arrays.sort(arr);
		int min = smallest(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("min : " + min); // second smallest sorted
		
	}
	public static int smallest(int [] arr)
	{
		int min1 = arr[0];
		

		for(int i = 1; i <arr.length;i++)
		{
			
			if(arr[i] != min1)
			{
				return arr[i];
			}
		}

		return min1;
	}

}