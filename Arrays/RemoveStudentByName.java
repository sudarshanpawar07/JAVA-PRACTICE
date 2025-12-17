import java.util.*;
class Student
{
	String name;
	int id;
	int age;
	String coll;
	double per;

	Student(String name,int id,int age,String coll,double per)
	{
		this.name = name;
		this.age = age;
		this.id = id;
		this.coll = coll;
		this.per = per;

	}

	public String toString()
	{
		return "[ " + "Name : " + name + " ,Age : " + age + " ,id : " + id + " ,coll : " + coll + " ,Percentage : " + per +" ]";
	}
}


class RemoveStudentByName
{
	public static void main(String[] args) {
		Student [] db = new  Student [4];

		 db [0] = new Student("Raju",234,23,"SP",88.78);
		 db [1] = new Student("Rani",235,15,"SAC",78);
		 db [2] = new Student("anil",236,25,"CEOP",99.78);
		 db [3] = new Student("sunil",237,22,"FC",95);

		 System.out.println(Arrays.toString(db));

		 System.out.println("----------------------------------------");
		 System.out.println(Arrays.toString(removeStudent(db,"Raju")));


		

	}

	public static Student[] removeStudent(Student [] arr,String username)
	{
		int namecount  = 0;
		for(int i = 0; i <arr.length;i++)
		{
			if(arr[i].name.equals(username))
			{
				namecount++;
			}
			
		}

		Student [] newArr = new Student[arr.length-namecount];

		for (int i = 0,j = 0;  i <arr.length;i++ ) {
			if(!(arr[i].name.equals(username)))
			{
				newArr[j++] = arr[i];
			}
		}
		return newArr;

	}

}

