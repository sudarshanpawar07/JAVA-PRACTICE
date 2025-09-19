class ExampleThis
{
	public static void main(String[] args)
	{
		ExampleThis obj = new ExampleThis();

		System.out.println(obj);// ExampleThis@372f7a8d
		obj.m1();// programmer Statement 
		//ExampleThis.m1(obj) this will happen inside the 
	}

	public void m1()
	{
		
		System.out.println(this); // this will print the current working object 
		// ExampleThis@372f7a8d
	}

}