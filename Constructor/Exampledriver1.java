class Parent
{
	Parent()
	{
		super();
		System.out.println(" no argument Constructor from Parent ");
	}
	

}
class Child extends Parent
{
	Child()
	{	
		super();
		System.out.println(" no argument constructor from child ");
	}
}
class Exampledriver1
{
	public static void main(String [] args)
	{
		System.out.println("Starts");
		new Child();
		new Parent();
		System.out.println("Ends");

		
	}
}