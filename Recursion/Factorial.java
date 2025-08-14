import java.util.Scanner;
class Factorial
{	static int  num;
	static int fact = 1 ;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print(" enter the number : ");
		num = sc.nextInt();
		
		
		FactorialOfNumber(num);
		
		System.out.println(num + " : "  + fact);
		
	}
	
	
	public static void FactorialOfNumber( int num )
	{
		
		fact *= num;
		num--;
		if(num == 0) return ;
		
		  FactorialOfNumber(num);
		
		
	}
	
	
	
}