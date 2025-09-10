class ExceptionalExample
{
	public static void main(String [] args)
	{
		float a = 9.84f;
		
		System.out.println(a == 9.84);// false 
			
		if(a > 9.84)
			System.out.println(" hello true Statement ");// true because computer store it like 9.839999999999 
		else
			System.out.println(" hello false statement");
	}
}