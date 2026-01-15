import java.util.Arrays;
class Freq
{
	public static void main(String[] args) {
		int []  arr = {1,2,3,4,4,5,7,3,2,8};
		boolean track [] = new boolean [arr.length];
		int repcnt = 0, k = 0;
		int [] newArr = new int [arr.length-1-repcnt];
		System.out.println(Arrays.toString(arr));


		
		for (int i = 0, count = 1; i < arr.length ;i++,count = 1 ) {
			if(track[i]) continue;
			for (int j = i+1; j < track.length;j++) {
				if(arr[i] == arr[j])
				{
						count++;
						track[j] = true;
				}
								
			}
			if(count > 1)
			{
				repcnt++;
			}

			newArr[k++] = arr[i];
			
		}

		System.out.println(Arrays.toString(newArr));

	}
	
}