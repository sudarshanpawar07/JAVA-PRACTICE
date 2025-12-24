class TernarySearch
{
	public static void main(String[] args) {
		int [] arr = new int[20];

		for (int i= 1;i < 20;i++) arr[i-1] = i;
		int key = 10;

		int op = ternarySearchIterative(arr,arr.length,key);
		System.out.println(key + ": " + op);

		int op1 = ternarySearchRecursive(arr,0,arr.length-1,key);
		System.out.println(key + ": " + op1);




	}
	public static int ternarySearchIterative(int [] arr, int n,int  key)
	{
		int low = 0, high = n-1;

		while(low <= high)
		{
			int mid1 = low + (high - low) /3;
			int mid2 = high - (high-low)/3;
			if (arr[mid1] == key) return mid1;
			else if(arr[mid2] == key) return mid2;
			else if(key < arr[mid1]) high = mid1-1;
			else if(key > arr[mid2]) low = mid2+1;
			else{
				low = mid1 + 1;
				high = mid2 - 1;

			}

		}

		return -1;
	}


	public static int ternarySearchRecursive(int [] arr, int low,int high,int  key)
	{
		

		if(low > high) return -1;
		
			int mid1 = low + (high - low) /3;
			int mid2 = high - (high-low)/3;
			if (arr[mid1] == key) return mid1;
			else if(arr[mid2] == key) return mid2;
			else if(key < arr[mid1]) return ternarySearchRecursive(arr,low,mid1-1,key);
			else if(key > arr[mid2]) return ternarySearchRecursive(arr,mid2+1,high,key);
			else
				return ternarySearchRecursive(arr,mid1+1,mid2-1,key);

			


		
	}
}