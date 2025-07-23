import java.util.Scanner;
class NextExample
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the string " );
		
		String str = sc.next();
		
		System.out.println(" Str : " + str);

		System.out.println(" length : " + str.length());

	}
}