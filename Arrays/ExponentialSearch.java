class ExponentialSearch
{
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int key = 8;
		int op = exponentialSearch(arr,arr.length-1,key);
		System.out.println(key + " : " + op);
	}

	public static  int exponentialSearch(int [] arr , int n , int key)
	{

		if(arr[0] == key) return 0;
		int i= 1;

		while(i < n && key > arr[i])
		{
			i = i * 2;
		}

		return binarySearch(arr,key,i/2,Math.min(i,n));
	}

	public static int binarySearch(int [] arr, int key, int low, int high)
	{
		while(low <= high)
		{
			int mid = ( high + low) /2;

			if(arr[mid] == key) return mid;
			else if(key < arr[mid]) high = mid-1;
			else low = mid+1;
		}
		return -1;
	}
}