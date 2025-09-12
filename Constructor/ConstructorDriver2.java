class Demo1
{
	int a;
	int b;
	Demo1(int a,int b)
	{
		this.a = a;
		this.b= b;
	}
	
}
class Demo2 extends Demo1
{
	int c;
	int d;

	Demo2(int a,int b,int c,int d)
	{
		super(a,b);
		this.c = c;
		this.d = d;
	}
	
}

class ConstructorDriver2
{
	public static void main(String[] args) {
		System.out.println("Starts");

		Demo2 obj = new Demo2(10,20,30,40);

		System.out.println("a : " + obj.a);
		System.out.println("b : " + obj.b);
		System.out.println("c : " + obj.c);
		System.out.println("d : " + obj.d);


		System.out.println("ends");
	}

}