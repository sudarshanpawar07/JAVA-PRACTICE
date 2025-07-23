class Practice
{
	public static void main(String [] args)
	{
		int num = 1;
		while(num <=100)
		{
			System.out.print(num + " ");
			num++;
		}

		System.out.println();
		System.out.println("---------------------------------------------------- ");

		int num2 = 100;
		while(num2 >=  1)
		{
			System.out.print(num2 + " ");
			num2--;

		}
		
		System.out.println();
		System.out.println("---------------------------------------------------- ");

		int num3 = 1;
		while(num3 <=100)
		{	
			
				System.out.print(num3 + " ");
			
			num3 += 2;
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------- ");


		int num4= 1;
		while(num4 <=100)
		{	
			if(num4 % 2 == 0)
			System.out.print(num4+ " ");
			
			num4++;
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------- ");

		
	}
}