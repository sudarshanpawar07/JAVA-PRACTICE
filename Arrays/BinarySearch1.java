class BinarySearch1
{
	public static void main(String[] args)
	{
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int key = 6;
		int op = binarySearch(arr,arr.length,key);
		System.out.println("Normal Approach : " + op);

		int op1 = binarySearchRecursion(arr,0,arr.length,key);
		System.out.println("Recursive Approach : "+ op1);
	}

	public static int binarySearch(int [] arr,int n,int key)
	{
			int min = 0, max = n -1; // this is iterative approach
			

			while(min <= max)
			{
				int mid = (min + max)/2;
				if(arr[mid] == key)
				{
					return mid;
				}
				else if(arr[mid] > key)
				{
					max = mid - 1;
				}else
				{
					min = mid +1;
				}
			}

			return -1;
	}

	public static int binarySearchRecursion(int [] arr,int min,int max,int key)
	{
			int mid = (min  + max)/2;

			if(min > max) return -1;

			if(arr[mid] == key) return mid;
			else if(arr[mid] > key) return binarySearchRecursion(arr,min,mid-1,key);
			else return binarySearchRecursion(arr, mid+1,max,key);

			
	}
}