 class Student
{
	static int unique;
	String sid ;
	String name;
	
	static{
		unique = 1234;
	}
	
	{
		// non-static block
		sid = "STUDID" + unique++;
	}
	
	Student(String name)
	{
		this.name = name;
	}
	
	public void displayStudent()
	{
		System.out.println(sid + " : " + name);
	}
}
class StudentDriver
{
	public static void main(String [] args)
	{
		Student obj = new Student("Ramesh");
		obj.displayStudent();
		
		Student obj1 = new Student("Suresh");
		obj1.displayStudent();

	}


}