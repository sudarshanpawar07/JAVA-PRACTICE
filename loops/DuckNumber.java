package loops;
import java.util.*;
public class DuckNumber {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		
		sc.close();
		if(num  == 0)
		{
			System.out.println(" Not Duck Number ");
			return;
		}
		
		boolean found =false;
		while(num > 0)
		{
			int last = num % 10;
			
			num /= 10;
			
			if(last == 0)
			{
				found = true;
				break;
			}
			
		}
		
		if(found)
		{
			System.out.println(" Duck Number ");
		}
		else {
			System.out.println(" Not duck number ");
		}
		
	}

}
