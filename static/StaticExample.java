class StaticExample
{
	static String name = "sudarshan";
	static
	{
		System.out.println(name);//satic block : here we can access the static var

	}
	StaticExample()
	{
		System.out.println(name);//constructor : here we can access the static var
	}
	
	public static void m1()
	{	
		System.out.println(name); // static method : here we can access the static var

	}
	public void m2()
	{
		System.out.println(name); // non-static method : here we can access the static var

	}
}