class College
{

	String collegeName;
	String department;
	String hodName;
	String instituteRollNumber;
	College(String collegeName)
	{
		this.collegeName = collegeName;
		this.department = department;
		this.hodName = hodName;
		this.instituteRollNumber = instituteRollNumber;

	}
	College(String collegeName,String department)
	{
		this.collegeName = collegeName;
		this.department = department;
		this.hodName = hodName;
		this.instituteRollNumber = instituteRollNumber;

	}
	College(String collegeName,String department,String hodName)
	{
		this.collegeName = collegeName;
		this.department = department;
		this.hodName = hodName;
		this.instituteRollNumber = instituteRollNumber;

	}


	College(String collegeName,String department,String hodName,String instituteRollNumber)
	{
		this.collegeName = collegeName;
		this.department = department;
		this.hodName = hodName;
		this.instituteRollNumber = instituteRollNumber;

	}

	public void displayInfo()
	{
		System.out.printf("%ncollegeName : "+ collegeName + " %ndepartment : " + department + 
			" %nhodName : " + hodName + "%ninstituteRollNumber : " + instituteRollNumber);
	}
	
}
class CollegeConstructor
{
	public static void main(String[] args)
	 {


	 	College obj1 = new College("PCCOE","AI","rajshree mam","CAAP:3304571");
	 		obj1.displayInfo();

		College obj2 = new College("PICT","ENTC","vimal mam","CAAP:3304572");
	 		obj2.displayInfo();
		
	 	College obj = new College("PICT","CS","sneha mam","CAAP:3304573");
	 		obj.displayInfo();
		
	}
	
}