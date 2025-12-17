import java.util.*;
// class CountElement
// {
// 	public static void main(String[] args) {
// 		int [] arr = { 1,2,3,6,5,3,79,90,12,77,96,26};
// 		int i= 0,count = 0;
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the number to take the count of it :  ");
// 		int ele = sc.nextInt();
// 		while(i < arr.length)
// 		{
// 			if(arr[i] == ele)
// 			{
// 				count ++; // time complexity O(n)
// 			}
// 			i++;
// 		}

// 		if(count == 0)
// 		{
// 			System.out.println("Element is not present.");
// 		}else{
// 			System.out.println(ele + " repeated for the " + count + " times.");
// 		}
// 	}
// }

class CountElement
{
	public static void main(String[] args) {
		int [] arr = { 1,2,3,6,5,3,79,90,12,77,96,3,3,26};
		int i= 0,j = arr.length-1,count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to take the count of it :  ");
		int ele = sc.nextInt();
		while(i < j)
		{
			if(arr[i] == ele)
			{
				count++; // time complexity O(n/2)
			}

			if(arr[j] == ele)
			{
				count++;
			}

			i++;
			j--;
		}

		if(count == 0)
		{
			System.out.println("Element is not present.");
		}else{
			System.out.println(ele + " repeated for the " + count + " times.");
		}
	}
}