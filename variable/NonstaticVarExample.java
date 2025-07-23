class NonstaticVarExample
{
	int a;

	String b;
	
	double c = 1.2;
	
	char d = 'a';
	
	Marker e;

	
	public static void main(String [] args)
	{
		NonstaticVarExample obj = new NonstaticVarExample();
		
		obj.m1();
			
	}

	public void m1()
	{
		System.out.println(a);//0
		
		System.out.println(b);//null

		System.out.println(c);//1.2
		
		System.out.println(d);//a
		
		System.out.println(e);//null

	}

}