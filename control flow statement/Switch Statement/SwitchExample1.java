class  SwitchExample1
{
	public static void main(String [] args)
	{
		/* System.out.println(" Starts");
		
		int a= 5;
		
		switch(a)
		{
			System.out.println(" helooo "); // CTE
		}
		
		System.out.println(" ends ");
		
	*/



/*
		System.out.println(" Starts");
		
		boolean a= true;
		
		switch(a)// slector type boolean is not allowed
		{
			case true : System.out.println(" helooo "); break;
		}
		
		System.out.println(" ends");
*/
		
	/*


	System.out.println(" Starts");
		
		byte a= 127;
		
		switch(a)
		{
			case 127 : System.out.println(" case 1 "); break;
			case 128 : System.out.println(" case 2 "); break;// CTE :incompatible types: possible lossy conversion from int to byte
			default : System.out.println(" default "); break;
		}
		
		System.out.println(" ends ");

*/



		System.out.println(" Starts");
		
		byte a= 127;
		
		switch(a+1)
		{
			case 1 : System.out.println(" case 1 "); break;

			case 127 : System.out.println(" case 1 "); break;
			case 128 : System.out.println(" case 2 "); break;
			default : System.out.println(" default "); break;
		}
		
		System.out.println(" ends ");
/*

		System.out.println(" Starts");
		
		byte b = 6;
		
		switch(b)
		{
			case 1 : System.out.println(" case 1 "); break;
			default : System.out.println(" default 1 "); break;
			case 2 : System.out.println(" case 1 "); break;
			case 3 : System.out.println(" case 2 "); break;
			default : System.out.println(" default 2 "); break;
		}
		
		System.out.println(" ends ");

*/


		System.out.println(" Starts");
		
		byte b= 5;
		
		switch(b)
		{
			
			default : System.out.println(" default "); break;
		}
		
		System.out.println(" ends ");



	    System.out.println(" Starts");
		
		byte d= 5;
		
		switch(5)
		{
			
			
		}		
		System.out.println(" ends ");


		
	    System.out.println(" Starts");
		
		byte e= 6;
		
		switch(a)
		{
			case 1 :
			{ 
				System.out.println(" case 1 "); 
			}
			System.out.println(" heloooo ");

			case 2 :
			{
			 	System.out.println(" case 2"); break;
			}
			case 3 : 

			{     
				System.out.println(" case 1 "); break;
			}
			
			
			
		}		
		System.out.println(" ends ");


	/*	 System.out.println(" Starts");
		
		int f= 1;
		int g = 2;
		
		switch(f)
		{
			case 1 :
			{ 
				System.out.println(" case 1 "); break;
			}
			case g :// CTE : constant expression required
			{
			 	System.out.println(" case 2"); break;
			}
			default : 

			{     
				System.out.println(" default "); break;
			}
			
			
			
		}		
		System.out.println(" ends ");
*/

	 System.out.println(" Starts");
		
		int f= 1;
		int g = 2;
		
		switch(f)
		{
			case 1 :
			{ 
				System.out.println(" case 1 "); break;
			}
			case g :// CTE : constant expression required
			{
			 	System.out.println(" case 2"); break;
			}
			default : 

			{     
				System.out.println(" default "); break;
			}
			
			
			
		}		
		System.out.println(" ends ");



	}
}