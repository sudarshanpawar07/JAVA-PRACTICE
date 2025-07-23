import java.util.Scanner;
class InputArray
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the size of array : " );
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		
		System.out.print(" Enter the elements in the array : ");
		for(int i=0;i<n;i++)
		{
		
		   arr[i] = sc.nextInt();

		}
		
		System.out.print(" The elements of an array is : ");
		
		for(int i=0;i<n;i++)
		{
		
		   System.out.print(arr[i] + " ");

		}

		
				
	


			
		
	}
}