import java.util.*;
class LargestRepWord{
	public static void main(String[] args) {
		
		String str = "my name is ramesh I am from Pune he  is genius guy.";
		String [] arr = str.split(" ");

		System.out.println(Arrays.toString(arr));
		boolean [] trace=new boolean[arr.length];

		int maxFreq=0;
		String maxEle = "";

		for (int i=0,cnt=1;i< arr.length;i++,cnt=1 ) 
		{
			if (trace[i]) {
				continue;
			}

			for (int j=i+1;j<arr.length ;j++ ) {
				if (arr[i].equals(arr[j])) {
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
		System.out.println("largest repeating  word is : "+maxEle);

	}
}