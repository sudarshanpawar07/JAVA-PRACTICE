import java.util.Scanner;
class NextLineExample
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the string " );
		
		String str = sc.nextLine();
		
		System.out.println(" Str : " + str);

		System.out.println(" Length : " + str.length());

	}
}