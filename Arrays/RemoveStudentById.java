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


class RemoveStudentById
{
	public static void main(String[] args) {
		Student [] db = new  Student [4];

		 db [0] = new Student("Raju",234,23,"SP",88.78);
		 db [1] = new Student("Rani",235,15,"SAC",78);
		 db [2] = new Student("anil",236,25,"CEOP",99.78);
		 db [3] = new Student("sunil",237,22,"FC",95);

		 System.out.println(Arrays.toString(db));

		 System.out.println("----------------------------------------");
		 System.out.println(Arrays.toString(RemoveStudentById(db,235)));


		

	}

	public static Student[] RemoveStudentById(Student [] arr,int id)
	{
		
		Student [] newArr = new Student[arr.length-1];

		for (int i = 0,j = 0;  i <arr.length;i++ ) {
			if(!(arr[i].id == id))
			{
				newArr[j++] = arr[i];
			}
		}
		return newArr;

	}

}

