class LocalVarExample

{	
	
	static
	{	
		char a = 'a';
	}

	{
		char b = 'b';
	}

	LocalVarExample()
	{
		char c = 'c';
	}

	public static void main(String [] args)
	{
		char d = 'd';

		System.out.println(d);
		
		// System.out.println(a); CTE : cannot find symbol a
		
		myMethod();// call function 
	}
	
	public static void myMethod()
	{
		char e = 'e';
		System.out.println(e);
	}
}
