/*
class Parent
{
	Object()
	{
		there is no super() & this() statement
	}
}
*/
class Demo1
{
	Demo1()
	{
		super();
		System.out.println(" parent Demo1 ");
	}
}
class Demo2 extends Demo1
{
	Demo2()
	{
		super();
		System.out.println(" child Deomo2 ");

	}
}
class ConstructorDriver
{
	public static void main(String[] args) {
		System.out.println(" starts");
		Demo2 obj = new Demo2();
		System.out.println(" ends ");

		
	}
	
}