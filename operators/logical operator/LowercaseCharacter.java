import java.util.Scanner;
class LowercaseCharacter
{
	public static void main(String [] args)
	{
	 	Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the cahracter : ");
		char ch = sc.next().charAt(0);
		
		boolean op = ( ch >= 'a' && ch <= 'z');
			
		System.out.println(op);
		
	}
}