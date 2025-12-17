import java.util.*;
class MergeArrayAtSpecificIndex
{
	
	public static void main(String[] args) {

		int [] arr ={10,20,30,40,50};
		int [] b = {2,3,4,5,6};

		int [] newArr = new int[arr.length + b.length];
		int index = 2;

		for (int i = 0,j = 0; i < newArr.length;i++ ) {

			
			if(i == index)
			{
				for (int k = 0; k < b.length;k++ ) {
					newArr[i++] = b[k];
					
				}
			}
			newArr[i] = arr[j++];

		}
		System.out.println(Arrays.toString(newArr));
	}
}