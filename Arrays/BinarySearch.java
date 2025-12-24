class BinarySearch
{
	public static void main(String[] args){

		int [] arr = {10,18,25,36,45,50,60,70};
		int search = 70;


			binarySearch(arr,search);


	}

	public static void binarySearch(int [] arr ,int search)
	{
			int start = 0,end = arr.length-1;
			int mid = (start + end)/2;

			while(start <= end)
			{
				if(arr[mid] == search)
				{
						System.out.println("Element found at " + mid +" index.");
						return ;
				}
				else if(arr[mid] > search)
				{
					end = mid - 1;
				}
				else
				{
					start = mid + 1;
				}
				
				mid = (start + end)/2;
			}

			if(start > end)
			{
				System.out.println("Element is not found ");
			}

	}

}