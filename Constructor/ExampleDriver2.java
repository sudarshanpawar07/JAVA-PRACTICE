
class Example12
{
	Example12()
	{
		this(123);
		System.out.println(" no argument const ");
	}
	Example12(int a)
	{	
		System.out.println(" Para const Example12()");
	}
} 
class ExampleDriver2
{
	public static void main(String [] args)	
	{
		System.out.println("Starts");
		new Example12();
		new Example12();	
		System.out.println("Ends");

	}
}