class PhoneNumberOddDigits
{
	public static void main(String [] args)
	{
		System.out.println("Odd Numbers : ");
		oddDigit(9075386378L);
	}
	public static void oddDigit(long num)
	{
		if(num == 0) return;

		long digit = num % 10;
		num /= 10;
		
		oddDigit(num);

		
		if(digit % 2 !=  0)
		{
			System.out.println(digit);
		} 
		
	}

}