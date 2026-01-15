import java.util.*;

class BubbleSortRecursion
{
	public static void main(String[] args) 
	{
		int [] arr = {31,23,5,8,9,7,78};
		System.out.println(Arrays.toString(arr));

		bubbleSort(0,arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int i,int []arr, int n)
	{
		if(i > n-1) return;
		
			innerIteration(arr,i,i+1,n);
			bubbleSort(++i,arr,n);


	}

	public static void innerIteration(int [] arr,int i ,int j,int n)
	{
		if(j > n-1) return;
		 
		 if(arr[i] >= arr[j])
		{
			int  temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp; 
		}
		innerIteration(arr,i,++j,n);
	}
}