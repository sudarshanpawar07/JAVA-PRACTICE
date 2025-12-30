import java.util.Arrays;
class SelectionSort{
	public static void main(String[] args) {
		int [] arr = {5,6,2,5,7,3,2,1};

		slectionSort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	public static void slectionSort(int [] arr , int n)
	{
		int cnt = 0;
		for (int i = 0 ; i < n -1 ;i++ ) {
			int min = i;
			for (int j = i +1;j < n ;j++ ) {
				if (arr[min] > arr[j]) {
					min = j;
					
				}

				
			}
			if(i == min) continue;
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			cnt++;

			
		}
		System.out.println(cnt);
	}
}