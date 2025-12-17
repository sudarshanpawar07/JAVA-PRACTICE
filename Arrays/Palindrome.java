class Palindrome{
	public static void main(String[] args) {
		int [] arr = {1,2,3,2,1};

		int i = 0, j = arr.length-1;
		while(i < j)
		{
			if(arr[i] != arr[j])
			{
				break;
			}
			i++;
			j--;
		}
		if( i < j)
		{
			System.out.println("Not Palindrome.");
		}else{
			System.out.println("Palindrome.");
		}
	}
	
}