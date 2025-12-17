import java.util.Arrays;
// class Demo{

// 	public static void main(String[] args) {
		
// 		int [] arr1 = {1,2,3,4,5};
// 		int [] arr2 = {6,7,8};

// 		int [] zigZag = new int[arr1.length+arr2.length];

// 		for (int i =0, j=0; i<zigZag.length ; i++) {
// 			if(i<arr1.length) zigZag[j++] = arr1[i];
// 			if(i<arr2.length) zigZag[j++] = arr2[i];
// 		}
// 		System.out.println(Arrays.toString(zigZag));
// 	}
// }

class Demo{

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6};
		int [] rev = new int[arr.length];

		for (int i =0, j=arr.length-1; i<arr.length/2 ; i++, j--) {
			// int temp = arr[i];
			// rev[i] = arr[j];
			// rev[j] = temp;

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}