import java.util.*;
class BubbleSort
{
	
	public static void main(String[] args) {
		int [] arr = {31,23,5,8,9,7,78};

		bubbleSort(arr); 
		bubbleSortDescending(arr);
	}

	public static void bubbleSort(int [] arr)
	{
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length ;i++ ) {
			for (int j = 0; j < arr.length-1-i ;j++) {

				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j]  = arr[j+1];
					arr[j+1] = temp;
				}

				
			}
			
		}
		System.out.println(Arrays.toString(arr));

	}


	public static void bubbleSortDescending(int [] arr)
	{

		System.out.println(Arrays.toString(arr));

			for(int i = 0;i <arr.length;i++)
			{
				for (int j = 0;j<arr.length-1-i ;j++ ){

					if(arr[j] < arr[j + 1])
					{
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		System.out.println(Arrays.toString(arr));
	}
}