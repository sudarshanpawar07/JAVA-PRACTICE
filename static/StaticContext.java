class StaticContext
{
	public static void main(String [] args)
	{
		System.out.println(" main() from StaticContext ");
		StaticContext obj = new StaticContext();
		obj.m3();
	}
	public void m3()
	{
		System.out.println(" non-satic m3() from StaticContext ");
		Example3.m2();
		new Example2().m1();
	}
}
class Example3
{	public static void m2()
	{	
		System.out.println(" m2() static  Example3 ");
	}
}