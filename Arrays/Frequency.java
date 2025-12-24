import java.util.*;
class Frequency{
	
	public static void main(String[] args) {
		int [] arr = {10,9,8,10,1,0,1,2,1,3,8};

		int [] fre = new int[arr.length];
		int dupCount= 0, repCount = 0;
		System.out.println(Arrays.toString(arr));


		for (int  i= 0; i < arr.length;i++ ){
			if(fre[i] != -1){
				int count = 0;
				for (int j = i+1;j < arr.length;j++ ){
					if(arr[i] == arr[j]){
						count++;
						fre[j] = -1;
						dupCount++;
					}
				}
				fre[i] = count;

				if(count > 0){
					repCount++;
				}
			}
		}


		int [] dup = new int[dupCount];
		int [] rep = new int[repCount];
		int [] uni = new int[arr.length-(repCount+dupCount)];

		for (int i = 0,j=0,k=0,l=0; i < fre.length;i++) {
			if(fre[i] == -1){
				dup[j++] = arr[i];
			}
			else if(fre[i] > 0)
			{
				rep[k++] = arr[i];
			}else if(fre[i]==0)
			{
				uni[l++] = arr[i];
			}
		}
		System.out.println("Frequency : "+ Arrays.toString(fre));
		System.out.println("Duplicate :" + Arrays.toString(dup));
		System.out.println("Repeated : " +Arrays.toString(rep));
	
	}


}