class Example
{
	Example()
	{
		this(10);
		System.out.println("default Example() ");
	}

	Example(int a)
	{
		this(a,"hello");
		System.out.println("Example(int a)");
	}
	Example(int a,String b)
	{
		System.out.println("Example(int a,string b) ");

	}


}

class ConstructorDriver1
{
	public static void main(String[] args) 
	{
		System.out.println("Starts");

		Example obj = new Example();

		System.out.println("Ends");

		
	}
}