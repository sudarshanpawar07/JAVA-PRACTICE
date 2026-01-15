import java.util.Arrays;
class QuickSort
{
	
	public static void main(String[] args) {

		int [] arr = {5,7,9,8,6,1,3,2};

		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int [] arr , int start, int end)
	{
		if(end < start)return ;
		int pivotIndx = partition(arr, start,end);
		quickSort(arr,start,pivotIndx-1);
		quickSort(arr,pivotIndx+1,end);


	}
	public static int partition(int [] arr , int start , int end)
	{
		int pivot = arr[end];
		// and start the j behind of i index ie
		int j = start - 1;
		for (int  i = start; i < end ;i++ ) {
			if(arr[i] < pivot)
			{
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}			
		}
		j++;
		int temp = arr[j];
		arr[j] = arr[end];
		arr[end] = temp;
		return j;
	}

}