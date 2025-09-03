class ExampleDemo
{
	public static void main(String [] args)
	{
		System.out.println(Math.pow(2,4));

		UserMath obj = new UserMath();
		System.out.println(obj.pow(2,4));
		System.out.println(Math.min(5,10));
		System.out.println(obj.min(5,10));
		System.out.println(Math.max(30,40));
		System.out.println(obj.max(30,40));
		System.out.println(Math.abs(10));
		System.out.println(obj.abs(10));
		
	}
}
class UserMath
{

	public double pow(double num,int pow)
	{	double op = 1;
		for(int i = 0; i< pow;i++)
		{	
			op *= num;
		}
		
		return op;

	}
		
		
	public double min(double num1,double num2)
	{	double op = 1;
		if(num1 < num2)
		{
			op = num1;
		}
		else{
			op = num2;
		}	
		return op;

	}

		
	public double max(double num1,double num2)
	{	double op = 1;
		if(num1 > num2)
		{
			op = num1;
		}
		else{
			op = num2;
		}	
		return op;

	}
		
	public int abs(int num)
	{	int op = 1;
		if(num ==  0)
		{
			op = 0;
		}
		if(num < 0)
		{	
			op = num * -1;
		}
		else{
			op = num;
		}	
		return op;

	}

	

 	
}