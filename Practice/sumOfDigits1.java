class sumOfDigits1
{
	public static void main (String [] args)
	{
	   int num = 1234;
	   int dup = num;
	   int sum = 0;
	   while(num > 0)
           {
		int rem = num % 10;
		sum = sum + rem;
		num = num / 10;

			
	  }
		System.out.println(" Num : " + dup);
		System.out.println(" sum : " + sum);
	}
}