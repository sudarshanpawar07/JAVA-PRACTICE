import java.util.Arrays;
class MissingElementApproach
{
	
	public static void main(String[] args) {
		int [] arr = {4,2,5,1,3,7};
		System.out.println(Arrays.toString(arr));
		System.out.println(missingNumber(arr));

	}

	 public static int missingNumber(int[] arr) {
        int eleSum  = 0, n = arr.length + 1;
        int expectedSum = n * (n  + 1 ) / 2;

        for(int i = 0; i< arr.length; i++)
        {
            eleSum += arr[i];
            
        }
        return expectedSum - eleSum;
        
    }
}
