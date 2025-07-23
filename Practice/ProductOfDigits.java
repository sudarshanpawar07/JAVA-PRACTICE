import java.util.Scanner;
class ProductOfDigits
{
	 public static void main(String [] args)
	 {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the number (length 1-4) : ");
		
		int num = sc.nextInt();
		int dup = num;
		int product = 1;

			
		int rem = num % 10;
		product = product * rem;
		num = num / 10;
		
		rem = num % 10;
		product = product * rem;
		num = num / 10;
		
		rem = num % 10;
		product = product * rem;
		num = num / 10;
		
		rem = num % 10;
		product = product * rem;
		num = num / 10;
		
			
		System.out.println(" Number is : " + dup);
		System.out.println(" Product is : " + product);

	 }
}