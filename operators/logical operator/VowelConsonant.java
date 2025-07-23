import java.util.Scanner;

class VowelConsonant
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the character : ");
		
		char ch = sc.next().toUpperCase().charAt(0);
		
		boolean op = ( ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' || ch == 'U');
		
		System.out.println(op);
		
	}
}