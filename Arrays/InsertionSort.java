import java.util.Arrays;
class InsertionSort{
	public static void main(String[] args) {
		int [] arr = {3,5,6,7,2,1};
		System.out.println(Arrays.toString(arr));
		insertionSort(arr,arr.length);
		System.out.println(Arrays.toString(arr));

	}

	public static void insertionSort(int [] arr , int n)
	{
		for (int i = 1;i < n ;i++ ) {
			int key = arr[i];
			int j = i-1;

			while(j >= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			
		}
	}

}