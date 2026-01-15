import java.util.Arrays;
class  MoveZeros
{
	public static void main(String[] args){

		int [] arr = {1,0,0,2,3,0,4,5,6};

		System.out.println(Arrays.toString(arr));
		int j = 0;
		for (int i  = 0; i < arr.length;i++ ) {
			if (arr[i] != 0) {
				arr[j++] = arr[i];
				
			}
			
		}

		for (int i = j; i  < arr.length; i++ ){
			arr[i] = 0;
			
		}

		// int rotation  = arr.length-j;

		// for (int i = 1; i < rotation; i++) {
		// 	int temp = arr[arr.length-1];
		// 	for (int k = arr.length-2;k >= 0 ;k--){
		// 		arr[k + 1] = arr[k];
				
		// 	}
		// 	arr[0] = temp;

		// }
		System.out.println(Arrays.toString(arr));
	}
}