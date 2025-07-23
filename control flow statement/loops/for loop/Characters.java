class Characters
{
	public static void main(String [] args)
	{
		for( char ch = 0 ; ch <= 127;ch++)
		{
			System.out.print(ch+" ");
		}
		
		System.out.println();
		System.out.println("------------------------------");
		
		for( char ch = 0 ; ch <= 127;ch++)
		{	if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)
			System.out.print(ch+" ");
		}

		System.out.println();
		System.out.println("------------------------------");
		
		for( char ch = 0 ; ch <= 127;ch++)
		{	if(!(ch >= 48 && ch <= 57 || ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122))
				System.out.print(ch+" ");
		}
		
		System.out.println();
		System.out.println("------------------------------");
		
		for( char ch = 'Z' ;ch <= 'A';ch++)
		{
			System.out.print(ch + " ");
		}

		
	}
}