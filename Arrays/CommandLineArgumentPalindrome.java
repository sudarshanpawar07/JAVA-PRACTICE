class CommandLineArgumentPalindrome
{
	public static void main(String[] args) {

		 if(palindrome("naman"))
		 {
		 	System.out.println("String is Palindrome.");
		 }
		 else{
		 	System.out.println("String is not Palindrome.");
		 }
		
	}

	public static boolean palindrome(String str)
	{
		
		String rev = "";

		for(int i = str.length()-1; i >= 0;i--){

			rev = rev + str.charAt(i);
		}

		return str.equals(rev);
	}
}