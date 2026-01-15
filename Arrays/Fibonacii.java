import java.util.Arrays;
import java.util.Scanner;
class Fibonacii
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the how much terms of Fibonacci u Want to store in an Array : ");
		int n = sc.nextInt();

		int [] fib = new int[n];
		System.out.println("Before : " + Arrays.toString(fib));

		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2;i < fib.length;i++) {

			fib[i] = fib[i-1] + fib[i-2];
			
		}

		System.out.println("After : " + Arrays.toString(fib));

	}
}