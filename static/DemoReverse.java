import java.util.Scanner;
class DemoReverse
{
	static Scanner sc = new Scanner(System.in);
	static int num;
	static int reverse ;
	static
	{
		System.out.print(" Enter the number : ");
		num = sc.nextInt();
		int op = reverseNumber(num);
		System.out.println("Reverse " + " : " + op);
		System.exit(0);

	}
	public static int  reverseNumber(int num)
	{
		int rem = num % 10;
		reverse = reverse * 10 + rem;
		num /= 10;
		if(num==0) return reverse;
		reverseNumber(num);
		return reverse;
	}
		
}