import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// infinite loop  
		for(;;)
		{
			System.out.println();
			
	
			System.out.println("    Welcome ");
			
			System.out.println();
			
			System.out.println(" List of currency : ");
			System.out.println(" 1. USD ");
			System.out.println(" 2. EUR ");
			System.out.println(" 3. ADA ");
			System.out.println(" 4. AED ");
			System.out.println(" 5. AFG ");
			System.out.println(" 6. AMD ");
			System.out.println(" 7. AOA ");
			System.out.println(" 8. AUD ");
			System.out.println(" 9. BTC ");
			System.out.println(" 10. LRD ");
			System.out.println(" FOR EXIT ENETER 0 ");
			System.out.println();
			
			System.out.print(" Enter your Amount : ");
			float inr = sc.nextFloat();
			
			System.out.print(" Enter the currency code : ");
			String code = sc.next().toUpperCase();
				
			boolean asump = true;
			
			float con = 0;
		
			if(code.equals("USD"))
			{
				con = inr / 85.5950f;
			}
			else if(code.equals("EUR"))
			{
				con = inr / 100.427f;
			}
			else if(code.equals("ADA"))
			{
				con = inr / 56.3757f;
			}
			else if(code.equals("AED"))
			{
				con = inr / 23.3316f;
			}
			else if(code.equals("AFG"))
			{
				con = inr / 1.22784f;
			}
			else if(code.equals("AMD"))
			{
				con = inr / 0.223038f;
			}
			else if(code.equals("AOA"))
			{
				con = inr / 0.223038f;
			}
			else if(code.equals("AUD"))
			{
				con = inr / 56.2373f;
			}
			else if(code.equals("BTC"))
			{
				con = inr / 0.000000105732445f;
			}
			else if(code.equals("LRD"))
			{
				con = inr / 2.3375963f;
			}
			else if(code.equals("0"))
			{
				System.out.println();
				System.out.println(" THANK YOU VISIT AGAIN :) ");
				
				return;
			}
			else{
				System.out.println(" INVALID CURRENCY CODE i.e : " + code);
				asump = false;
			}
			if(asump)
			{
				System.out.println(inr + " INR : " + con + " " + code);
			}
			
		}
		
		
	}
}