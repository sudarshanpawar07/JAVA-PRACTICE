import java.util.Scanner;
class Even
{	
	public static void main(String [] args)
	{
		System.out.print(" Enter the number : ");

		int num = new Scanner(System.in).nextInt();

		System.out.println(num % 2 == 0);
	}
}