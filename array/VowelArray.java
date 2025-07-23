import java.util.Scanner;
class VowelArray
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the character : ");
		
		char ch = sc.next().toLowerCase().charAt(0);
		
		char vowel [] = {'a','e','i','o','u'};
				
		for(int i = 0; i < vowel.length ; i++)
		{
			if (ch == vowel[i])
			{
				System.out.println(" The character is : Vowel ");
				break;		
			}
			else
			{
				System.out.println(" The character is : Consonant ");
				break;
			}
			
		}
		
		
	}
}