import java.util.*;
class RemoveElementAtIndex
{
	public static void main(String[] args) {
		// int [] arr = {10,20,30,40,50};
		// System.out.println(Arrays.toString(arr));
		// System.out.println("------------------------------");
		// int [] ans = removeElement(arr, 2);
		// System.out.println(Arrays.toString(ans));
		// System.out.println("-----------------------------");
		// int[] data = insertAtIndex(2,7);
		// System.out.println(Arrays.toString(data));

		System.out.println("-----------------------------");
		int [] dt = removeElementInRange(1,3);
		System.out.println(Arrays.toString(dt));

		// System.out.println(" Remove Value from array : ");
		// int [] arr1 = {1,2,3,4,5,6};
		// int [] result =  removeValue(arr1,3);
		// System.out.println(Arrays.toString(result));

	}

	public static int []  removeElement(int [] arr, int index)
	{

		

		if(index >= 0 && index < arr.length)
		{
			int [] data = new int[arr.length-1];

			for(int i = 0; i<arr.length;i++)
			{
				if(i < index)
				{
					data[i] = arr[i];
				}
				else if(i > index)
				{
					data[i-1] = arr[i];
				}
			}
			return data;
		}
		return arr;
	}

	public static int[] insertAtIndex(int index, int val)
	{
		int [] arr = {5,6,4,2,1};
		int [] newArr = new int [arr.length + 1];

		for(int i = 0 ;i<newArr.length;i++)
		{
			if(i < index)
			{
				newArr[i] = arr[i];
			}
			else if (i == index) {
				newArr[i] = val;
				
			}
			else{
				newArr[i] = arr[i-1];
			}
		}
		return  newArr;
	}

	public static int[] removeElementInRange(int start ,int end)
	{											// 1 & 3
		int [] arr = {10,9,5,4,1,2};
			// 10 1 2


		System.out.println(Arrays.toString(arr));

		int [] newArr = new int[arr.length-(end-start + 1)];
		for (int i = 0, j=0; i<arr.length ;i++ ) {
			// if(i < start)
			// {
			// 	newArr[j++] = arr[i];
			// }
			// else if(i > end)
			// {
			// 	newArr[j++] = arr[i];
			// }
			
			if(!(i >= start && i <= end))
				newArr[j++] = arr[i];
		}
		return newArr;
	}

	public static int [] removeValue(int [] arr, int ele)
	{
		int i = 0;
		for ( ; i < arr.length ; i++ ) {


			if(arr[i] == ele)
			{
				break;
			}
			
		}

		if(i == arr.length)
		{
			System.out.println("element not Found .");
			
		}
		else{
			int [] data = removeElement(arr,i);
			return data;
		}

		return arr;
	}
}