class SpecialCharacter
{
	public static void main(String [] args)
	{
		char ch5 = 0;
		while( ch5 <=127)
		{	
			if(ch5 >= 48 && ch5 <= 57 || ch5 >= 97 && ch5 <= 122 || ch5 >= 65 && ch5 <= 90)
				System.out.print(ch5 + " ");
			
			ch5++;

		}
		
		System.out.println();
		System.out.println("---------------------------------------------------- ");
		
		char ch = 'Z';
		while(ch >= 'A')
		{
			System.out.print(ch + " ");
			ch--;
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------- ");
		
		char ch1 = 'z';
		while(ch1 >= 'a')
		{
			System.out.print(ch1 + " ");
			ch1--;
		}


		System.out.println();
		System.out.println("---------------------------------------------------- ");
		
		char ch2 = 'a';
		while(ch2 <= 'z')
		{
			System.out.print(ch2 + " ");
			ch2++;
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------- ");
		
		char ch3 = 'a';
		while(ch3 <= 'z')
		{
			System.out.print(ch3 + " : " + (ch3 + 0) + " ");
			ch3++;
		}

		System.out.println();
		System.out.println("---------------------------------------------------- ");
		
		char ch4= 'A';
		while(ch4 <= 'Z')
		{
			System.out.print(ch4 + " : " + (ch4 + 0) + " ");
			ch4++;
		}

		
		System.out.println();
		System.out.println("---------------------------------------------------- ");
		
		char ch6 = 'A';
		while(ch6 <= 'Z')
		{
			System.out.print(ch6 + " ");
			ch6 += 2;
		}
		
	
		System.out.println();
		System.out.println("---------------------------------------------------- ");

		int step = 1;
		char ch7 = 'A';
		while(ch7 <= 'Z')
		{
			System.out.print(ch7 + " ");
			step++;
			ch7 += step;
		}



	}
}