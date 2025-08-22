class ClassExample
{
	public static void main(String [] args)
	{
		System.out.println(" main() from classExample ");
		// m1();// CTE : cannot find symbol m1()
		Example1.m1();// class name as reference
	}
}
// another class 
class Example1
{
	public static void m1()
	{
		System.out.println(" m1() from Example1 ");
	}
}