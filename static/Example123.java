class Example123
{
	static{
	System.out.println(" static block 1 ");
	}
	public static void main(String [] args)
	{
		System.out.println("main()");
		m1();
	}
	
	static{
	System.out.println(" static block 2 ");
	}

	static{
	System.out.println(" static block 3 ");
	}
	public static void m1()
	{
		System.out.println(" m1() ");
	}

	static{
	System.out.println(" static block 4 ");
	}

}