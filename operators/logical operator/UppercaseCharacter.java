class UppercaseCharacter
{
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print(" Enter the character : ");
		char ch = sc.next().charAt(0);
		
		boolean op = ( ch >= 'A' && ch <= 'Z');
			
		System.out.println(op);
	}
}