import java.util.Scanner;
class Vowel
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the character : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		if(! (ch >= 65 && ch <= 90))
		{
			System.out.println(ch + " is not an Alphabet ");
			return;
		}
		

		switch(ch)
		{
			case 'A' : 
			{
				System.out.println(ch + " is Vowel");
				break;
			}
			case 'E' : 
			{
				System.out.println(ch + " is Vowel");
				break;
			}
			case 'I' : 
			{
				System.out.println(ch + " is Vowel");
				break;
			}
			case 'O' : 
			{
				System.out.println(ch + " is Vowel");
				break;
			}

			case 'U' : 
			{
				System.out.println(ch + " is Vowel");
				break;
			}
			default: 
			{
				System.out.println(ch + " is Consonant ");
				break;
			}








		}
		
		
	}
}