class StaticVarExample
{
	static int a;
	
	static String b;
	
	static double c = 1.2;
	
	static char d = 'a';
	public static void main(String [] args)
	{
		System.out.println(a);//0
		
		System.out.println(b);//null

		System.out.println(c);//1.2
		
		System.out.println(d);//a
		
		m1();
		
		
	}
	
	public static void m1()
	{
		System.out.println(a);//0
		
		System.out.println(b);//null

		System.out.println(c);//1.2
		
		System.out.println(d);//a

	}
}