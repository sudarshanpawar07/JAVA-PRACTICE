import java.util.*;
class UnionInterSection
{
	public static void main(String[] args) {
		int [] arr1 = {10,20,30,40,50};
		int [] arr2 = {40,10,100,90};


		System.out.println("Array 1 : " + Arrays.toString(arr1));
		System.out.println("Array 2 : " +Arrays.toString(arr2));

		System.out.println("Union : " + Arrays.toString(union(arr1,arr2)));
		System.out.println("InterSection : " + Arrays.toString(interSection(arr1,arr2)));

	}

	public static int[] interSection(int [] arr1,int[] arr2)
	{
		int ctOfCommon = countOfCommon(arr1,arr2);
		int [] ans = new int[ctOfCommon];

		for (int i = 0,j=0; i < arr1.length ;i++ ) {
			if (contains(arr2,arr1[i])) {
				ans[j++] = arr1[i];
				
			}
		}
		return ans;
	}

	public static int[] union(int [] arr1,int [] arr2)
	{

		int ctOfCommon = countOfCommon(arr1,arr2);
		int [] ans = new int[(arr1.length + arr2.length)-ctOfCommon];
		int i ;
		for(i = 0;i<arr1.length;i++)
		{
			ans[i] = arr1[i];
		}

		for(int j = 0; j < arr2.length;j++)
		{
			if(!contains(arr1,arr2[j]))
			{
				ans[i] = arr2[j];
				i++;
			}
		}

		return ans;
	}
	
	public static int countOfCommon(int [] arr1 , int [] arr2)
	{
		int ctOfCommon = 0;
		if(arr1.length < arr2.length)
		{
			for (int i = 0; i < arr1.length ;i++ ) {
				if(contains(arr2,arr1[i]))
				{
					ctOfCommon++;
				}
				
			}
		}
		else{

			for (int i = 0; i < arr2.length;i++ ) {
				if(contains(arr1,arr2[i]))
				{
					ctOfCommon++;
				}
				
			}
		}
		return ctOfCommon;
	}

	public static boolean contains( int [] arr1,int ele)
	{
		for (int i = 0;i < arr1.length;i++ ) {
			if(arr1[i] == ele)
			{
				return true;
			}
			
		}
		return false;
	}
}