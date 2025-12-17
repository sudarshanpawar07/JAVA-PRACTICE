import java.util.*;
// class MinElement
// {
// 	public static void main(String[] args) {
// 		int [] arr = new int[20];

// 			for(int i = 0; i<arr.length;i++)
// 			{
// 				arr[i] = (int )(Math.random() * 100);
// 			}
// 			System.out.println(Arrays.toString(arr));

// 			int  min = Integer.MAX_VALUE;
// 			for(int ele : arr)
// 			{
// 					if(min > ele)
// 					{
// 						min = ele;
// 					}
// 			}
// 			System.out.println(min); //min  unsorted
// 	}
// }

class MinElement
{
	public static void main(String[] args) {
		int [] arr = new int[20];

			for(int i = 0; i<arr.length;i++)
			{
				arr[i] = (int )(Math.random() * 100);
			}

			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));


			int  min = Integer.MAX_VALUE;
			for(int ele : arr)
			{
					if(min > ele)
					{
						min = ele;
					}
			}
			System.out.println(min); //min  unsorted
	}
}