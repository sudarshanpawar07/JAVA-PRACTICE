import java.util.*;
class LargestRepCharacter{
	public static void main(String[] args) {
		
		String str = "hello";
		char [] arr = str.toCharArray();

		System.out.println(Arrays.toString(arr));
		boolean [] trace=new boolean[arr.length];

		int maxFreq=0;
		char maxEle = arr[0];

		for (int i=0,cnt=1;i< arr.length;i++,cnt=1 ) 
		{
			if (trace[i]) {
				continue;
			}

			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i] == (arr[j])) {
					cnt++;
					trace[j]=true;
				}
			}
			System.out.println(arr[i]+" : "+cnt);
			
			if (cnt>maxFreq) 
			{
				maxFreq = cnt;
				maxEle = arr[i];

			}
		}
		System.out.println("largest repeating  Character is : "+maxEle);

	}
}