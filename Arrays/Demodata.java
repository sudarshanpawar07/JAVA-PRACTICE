class Demodata
{
	public static void main(String[] args) {
		int [] arr = {1,2,3,5};
		System.out.println(missingNumber(arr));
		
	}
	 public static int missingNumber(int[] arr) {

        int sum = 0;
        for(int i = 0; i< arr.length;i++)
        {
            sum+=arr[i];
            
        }
        System.out.println(arr.length);
        int exp = arr.length * (arr.length + 1)/2;
        System.out.println(exp);
        return exp-sum;
    }
}