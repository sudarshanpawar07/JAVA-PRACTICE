class PhoneNumberEvenDigits
{
	public static void main(String [] args)

	{	
		System.out.println("Even Numbers : ");

		evenDigit(9075386378L);
	}
	public static void evenDigit(long num)
	{
		long digit = num % 10;
		num /= 10;

		if(num == 0) return;
		evenDigit(num);

		if(digit % 2 == 0)
		{
			System.out.println(digit);
		} 
				
		

	}

}