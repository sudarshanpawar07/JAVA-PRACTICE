import java.util.Arrays;
class largestRepetingElement
{
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,5,6,7,8,5,4,3,2,6,7,9};
		int max = Integer.MIN_VALUE;

		boolean [] trace = new boolean[arr.length];
		System.out.println(Arrays.toString(arr));



		for (int i = 0,cnt = 1;i < arr.length;i++,cnt= 1) {
			
				if(trace[i])continue;
			for(int j = i+ 1;j < arr.length;j++){

				if(arr[i] == arr[j])
				{
					cnt++;
					trace[j] = true;
				}

				if(cnt > 1)
				{

					for (int ele : arr) 
					{

						if(ele > max)
						{
							max = ele;
						}
					}

				}
				

			}
			
		}
		System.out.println(max );
	}
	
}