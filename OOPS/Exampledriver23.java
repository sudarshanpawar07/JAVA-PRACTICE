class  Parent
{
	String str1 = "Parent";
	public void m1()
	{
		System.out.println("m1() from Parent ");
	}
	
}
class Child extends Parent
{
	String str2 = "Child";
	public void m1()
	{
		System.out.println("m1() from Child ");
	}

}
class Exampledriver23
{
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1();
		System.out.println(obj.str1);	
	}
}