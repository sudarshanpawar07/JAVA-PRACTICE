import java.util.*;
class SentinelSearch
{
	public static void main(String[] args) 
	{
		int [] arr = {12,23,45,56,77,89,90,80,75,43};
		int key = 234;
		System.out.println(Arrays.toString(arr));

		int op = sentinelSearch(arr, arr.length,key);
		System.out.println("Normal Approach : " + op);

		int op1 = sentinelSearchRecursive(arr, arr.length,key,0);
		System.out.println("Recursive Approach : " + op1);
	}

	public static int sentinelSearch(int [] arr,int n ,int key)
	{
		int last = arr[n-1];

		arr[n-1] = key;

		int i = 0;
		while(arr[i] != key) i++;

		arr[n-1] = last;

		if(i < n-1 || arr[i] == key) return i;
		else return -1; 
			
		

	}

	public static int sentinelSearchRecursive(int [] arr,int n,int key, int i)
	{
		int last = arr[n-1];
		arr[n-1] = key;

		if(arr[i] != key) return sentinelSearchRecursive(arr,n,key,++i);

		arr[n-1] = last;

		if(i < n-1 || last == key) return i;
		return -1;		
	}


}