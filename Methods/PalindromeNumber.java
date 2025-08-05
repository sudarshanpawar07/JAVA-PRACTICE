
class PalindromeNumber
{
		static int  num;
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print(" Enter the number  : ");
		 num = sc.nextInt();

		if(isPalindrome())
		{
			
			System.out.println(num + " is  palindrome ");	
		}
		else
		{
			System.out.println(num + " is  not palindrome ");

		}	
		
	}
			
	
	public static boolean isPalindrome()
	{

		int dup = num;

		int rev = 0;
		
		while(dup != 0)
		{
			int rem = dup % 10 ;
			rev = rev * 10 + rem;
			dup /= 10;
		}

		if(num == rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
}