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


class StudentDriver1
{
	public static void main(String[] args) {
		Student [] db = new  Student [4];

		 db [0] = new Student("Raju",234,23,"SP",88.78);
		 db [1] = new Student("Rani",235,15,"SAC",78);
		 db [2] = new Student("anil",236,25,"CEOP",99.78);
		 db [3] = new Student("sunil",237,22,"FC",95);

		 //System.out.println(Arrays.toString(db));


		 Student [] db1 = new  Student [4];

		 db1 [0] = new Student("mukesh",237,23,"SP",88.78);
		 db1 [1] = new Student("sakshi",238,15,"PICT",78);
		 db1 [2] = new Student("ganesh",239,25,"SKN",99.78);
		 db1 [3] = new Student("ajay",240,22,"SIP",95);

		 System.out.println(findTopper(db));

		 System.out.println("---------------------------------------------");
		 System.out.println(youngStudent(db));

		 System.out.println("---------------------------------------------");


		 Student [] ans = mergeDb(db, db1);
		 System.out.println(Arrays.toString(ans));
		 System.out.println("---------------------------------------------");

		
	}

	public static Student findTopper(Student [] arr)
	{
		double max = 0;
		Student ans = null;

		for(int i = 0; i <  arr.length;i++)
		{
			if(arr[i].per > max)
			{
				max = arr[i].per;
				ans = arr[i];
			}
		}
		return ans;
	}

	public static Student youngStudent(Student [] arr)
	{
		int minAge = arr[0].age;
		Student ans = null;

		for(int i = 1;i<arr.length;i++)
		{
			if(minAge > arr[i].age)
			{
				minAge = arr[i].age;
				ans = arr[i];
			}
		}

		return ans;
	}

	public static Student [] mergeDb(Student [] db ,Student [] db1)
	{
		Student [] data = new Student[db.length + db1.length];

		for(int i = 0 ; i< data.length;i++)
		{
			if(i < db.length)
			{
				data[i] = db[i];
			}
			else{
				data[i] = db1[i-db.length];
			}

			
		}

		return data;
	}


}