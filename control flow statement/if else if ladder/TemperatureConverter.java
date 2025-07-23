import java.util.Scanner;
class TemperatureConverter
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		for(; ;)
		{
						
			System.out.println();
			
			System.out.println(" 1. Fahrenheit -> (F) ");
			System.out.println(" 2. Kelvin -> (K) ");
			System.out.println(" 3.  Rankine -> (R) ");
			System.out.println(" FOR EXIT ENTER -> (0) ");
		
			System.out.print(" Enter the temperature in degree celsius : ");
			double  celsius = sc.nextDouble();

			
			System.out.print(" Enter the temperature code : ");
			String code = sc.next().toUpperCase();
			
			 double temp = 0;
			
			boolean asump = true;

			
			if(code.equals("F"))
			{
				
				temp =(celsius * 9/5) + 32;	
			}
			else if(code.equals("K"))
			{
			

				temp  = celsius + 273.15f;	
			}
			else if(code.equals("R"))
			{
				
				temp = (celsius + 273.15f) * 9/5 ;
			}
			else if(code.equals("0"))
			{
				System.out.println(" THANK YOU VISIT AGAIN :) ");
				asump = false;
				continue;
			}
			else
			{
				System.out.println(" INVALID CODE ");
			}
			if(asump)
			{
				System.out.println(celsius + " Celsius is "  + temp +" " + code);
			}

			
			


			 
			
			
			
			

	

			
		
		}

	}
}