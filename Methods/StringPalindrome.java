
class StringPalindrome
{
		static String str ;
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print(" Enter the data  : ");
		 str = sc.next();

		if(isPalindrome())
		{
			
			System.out.println(str + " is  palindrome ");	
		}
		else
		{
			System.out.println(str + " is  not palindrome ");

		}	
		
	}
			
	
	public static boolean isPalindrome()
	{

		String rev = "";
		for(int i = 0; i < str.length();i++)
		{
			char ch = str.charAt(i);
			rev = ch + rev;
		}
		
		return str.equals(rev);
		
			
	}

	
}