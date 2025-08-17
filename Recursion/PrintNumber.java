import java.util.Scanner;
class PrintNumber
{
	static int sum;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Number  :  " );
		int num = sc.nextInt();
		printNum(num);
		System.out.print("\n sum  :  " + sum);

	}
	
	public static void  printNum(int num)
	{
		if(num == 0) return;
		
		printNum(num - 1);
		sum += num;
		
		System.out.print(num + " ");
	}
}