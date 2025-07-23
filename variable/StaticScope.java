class StaticScope
{

	static int a;

	 public static void main(String [] args)
	{
		m1();
		System.out.println(a);//456
			
		a = 123;
		
		System.out.println(a);//123
		
	}
	
	public static void m1()
	{
		System.out.println(a);//0
		
		a = 456;
	}
}