import java.util.*;
// class RotateArrayClockwise{

// 	public static void main(String[] args) {
// 		int [] arr = new int[10];

// 		for(int i = 0; i<arr.length;i++) arr[i] = i+1;
// 		System.out.println(Arrays.toString(arr));

// 		System.out.println("enter the ratation : ");
// 		int rotation = new Scanner(System.in).nextInt();

// 		for(int i =1 ;i<=rotation;i++)
// 		{
// 			int temp = arr[0];
// 			for(int j = 1;j<arr.length;j++)
// 			{
// 				arr[j-1] = arr[j];
// 			}
// 			arr[arr.length-1] = temp;
// 		}

// 		System.out.println(" Rotation of array : " + Arrays.toString(arr));


// 	}
	
// }

class RotateArrayClockwise{

	public static void main(String[] args) {
		int [] arr = new int[10];

		for(int i = 0; i<arr.length;i++) arr[i] = i+1;
		System.out.println("Before Rotation : " + Arrays.toString(arr));

		System.out.println("enter the ratation : ");
		int rotation = new Scanner(System.in).nextInt();

		for(int i =1 ;i<=rotation;i++)
		{
			int temp = arr[arr.length-1];
			for(int j = arr.length-2;j >= 0;j--)
			{
				arr[j+1] = arr[j];
			}
			arr[0] = temp;
		}

		System.out.println("Anticlockwise Rotation  of array : " + Arrays.toString(arr));


	}
	
}