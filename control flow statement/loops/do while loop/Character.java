class Character
{
	public static void main(String [] args)
	{
		// 1 to 100
		int i = 1;
		do{
			System.out.print(i + " ");
			i++;
		}while(i <= 100);

		System.out.println();
		System.out.println("-------------------------------------------------------");

		// 100 to 1
		int j = 100;
		do{
			System.out.print(j + " ");
			j--;
		}while(j >= 0);
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		
		// even number
		int k = 2;
		do{
			
			System.out.print(k + " ");

			k+= 2;
		}while(k <= 100);
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		
		// odd number

		int l = 1;
		do{
			if( l % 2 != 0)
			System.out.print(l + " ");

			l++;
		}while(l <= 100);
		
		System.out.println();
		System.out.println("-------------------------------------------------------");

		// uppercase alphabet
		char ch = 'A';
		
		do{
			System.out.print(ch + " ");
			ch++;
		}while(ch <= 'Z');
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		
		// lowercase alphabet 
		char low = 'a';
		
		do{
			System.out.print(low + " ");
			low++;
		}while(low <= 'z');
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		
		// lowercase z to a 
		char rev = 'z';
		
		do{
			System.out.print(rev + " ");
			rev--;
		}while(rev >= 'a');
			
		System.out.println();
		System.out.println("-------------------------------------------------------");
		
		// digit using ascii value
		char digit = 48;
		
		do{
			System.out.print(digit + " ");
			digit++;
		}while(digit <= 57);
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		
		// character digts , lower & uppercase alphabets
		char charac = 0;
		
		do{
			if( charac >= 48 && charac <= 57 || charac >= 65 && charac <= 90 || charac >= 97 && charac <= 122)
			System.out.print(charac + " ");
			charac++;
		}while(charac <= 127);
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		
		// special character 
		char specialCharac = 0;
		
		do{
			if( !(specialCharac >= 48 && specialCharac <= 57 || specialCharac >= 65 && specialCharac <= 90 || specialCharac >= 97 && specialCharac <= 122))
			System.out.print(specialCharac + " ");
			specialCharac++;
		}while(specialCharac <= 127);
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		
		




	}
}