import java.util.*;
class OldStudent
{
	String name;
	int id;
	int age;
	String coll;
	double per;

	OldStudent(String name,int id,int age,String coll,double per)
	{
		this.name = name;
		this.age = age;
		this.id = id;
		this.coll = coll;
		this.per = per;

	}

	public String toString()
	{
		return "[ " + " ,Name : " + name + " ,Age : " + age + " ,id : " + id + " ,coll : " + coll + " ,Percentage : " + per +" ]";
	}
}

class NewStudent
{
	String name;
	int id;
	int age;
	String coll;
	double per;

	NewStudent(String name,int id,int age,String coll,double per)
	{
		this.name = name;
		this.age = age;
		this.id = id;
		this.coll = coll;
		this.per = per;

	}

	public String toString()
	{
		return "[ " + " ,Name : " + name + " ,Age : " + age + " ,id : " + id + " ,coll : " + coll + " ,Percentage : " + per +" ]";
	}
}
class StudentDriver
{
	
	public static void main(String[] args) {

		OldStudent [] db = new OldStudent[2];

		 db [0] = new OldStudent("Raju",234,23,"SP",88.78);
		 db [1] = new OldStudent("Rani",235,22,"FC",78);

		 System.out.println(Arrays.toString(db));

		NewStudent []  db1 = new NewStudent[2];

		 db1[0] = new NewStudent("Ramesh",23434,23,"Sarhad college",88.78);
		 db1[1] = new NewStudent("kaka",23453,22,"Modern college",78);

		 System.out.println(Arrays.toString(db1));

		 
		
	}
}