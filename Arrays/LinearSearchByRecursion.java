import java.util.*;
class LinearSearchByRecursion
{
	public static void main(String[] args) {
		int [] arr = {12,23,45,56,77,89,90,80,75,43};
		int key = 90;
		System.out.println(Arrays.toString(arr));

		int op = linearSearchByRecursion(arr, arr.length,key,0);
		System.out.println("Recursive Approach : " + op);

		int op1 = linearSearch(arr,key);
		System.out.println("Normal Approach : " + op1);
	}
	public static int  linearSearchByRecursion(int [] arr, int n, int key, int i)
	{

			if(i == n) return -1;
			if(arr[i] == key) return i;
			return linearSearchByRecursion(arr,n,key,++i);
	}

	public  static  int linearSearch(int [] arr , int key)
	{
		int i ;
		for ( i=0 ; i < arr.length;i++ )
		{
			if(arr[i] == key)
			{
				return i;
				
			}
			
		}

		// if(i == arr.length)
		// {
		// 	System.out.println("Element is Not Found ! ");
		// }else
		// {
		// 	System.out.println("Element found at " + i + " index .");
		// }

		return -1;
	}
}