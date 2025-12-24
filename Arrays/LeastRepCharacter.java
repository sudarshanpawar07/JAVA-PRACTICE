import java.util.*;
class LeastRepCharacter{
	public static void main(String[] args) {
		
		
		String str = "helloh";

		char [] arr = str.toCharArray();
		boolean [] trace=new boolean[arr.length];

		int minFreq = arr.length;
		char minEle= arr[0]; // '\0' we can store null value of char 

		for (int i=0,cnt=1;i<arr.length;i++,cnt=1 ) 
		{
			if (trace[i]) {
				continue;
			}

			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i] == arr[j]) {
					cnt++;
					trace[j]=true;
				}
			}
			System.out.println(arr[i]+" : "+cnt);
			
			if (cnt< minFreq) 
			{
				minFreq = cnt;
				minEle=arr[i];

			}
		}
		System.out.println("least  repeating Character is : "+minEle);

	}
}