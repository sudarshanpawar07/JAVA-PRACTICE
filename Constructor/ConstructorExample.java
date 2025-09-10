class Student
{	String name;
	String email;
	long contact;
	Student(String name)
	{
		this.name = name;
		this.email = email;// default value 
		this.contact = contact;// default value
	}
	
	
	Student(String name , String email)
	{
		this.name = name;
		this.email = email;
		this.contact = contact; // default value  because we are not passing the actual argument to the constructor 
	}

	
	Student(String name , String email,long contact)
	{
		this.name = name; // usedefined value 
		this.email = email;
		this.contact = contact;
	}

	
	public void displayInfo()
	{	
		System.out.println(" Name : " + name + " Email : " + email + " Contact : " + contact);
	}
}
class ConstructorExample
{
	public static void main(String [] args)	
	{
		Student obj = new Student("nana");
		obj.displayInfo();
		
		Student obj1 = new Student("kaka","kaka@gamil.com");
		obj1.displayInfo();

		Student obj2 = new Student("dada","dada@gamil.com",9075386378l);
		obj2.displayInfo();

	}
}