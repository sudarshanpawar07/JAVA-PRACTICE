class Processor
{
	String generation;
	String ram;
	double clockSpeed;
	String name;

	Processor()
	{
		super();
	}

	Processor(String generation,String ram,double clockSpeed,String name)
	{
		super();
		this.generation = generation;
		this.ram = ram;
		this.name = name;
		this.clockSpeed = clockSpeed;
	}

	Processor(Processor oldMobile)
	{
		super();
		this.generation = oldMobile.generation;
		this.ram = oldMobile.ram;
		this.name = oldMobile.name;
		this.clockSpeed = oldMobile.clockSpeed;
	}

	public void displayProcessor()
	{
		System.out.println("\n Processor Details : ");
		System.out.println("Name : " + name);
		System.out.println("generation : " + generation);
		System.out.println("ram : " + ram);
		System.out.println("clockSpeed : " + clockSpeed);

	}
}
class Mobile extends Processor
{
	String brand;
	String model;
	double price;
	Processor processor;

	Mobile()
	{
		super();
	}

	Mobile(String brand,String model,double Price,Processor processor)
	{
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	Mobile(Mobile oldMobile)
	{
		super();

		this.brand  = oldMobile.brand;
		this.model = oldMobile.model;
		this.price = oldMobile.price;
		this.processor = oldMobile.processor;
	}

	public void displayMobile()
	{
		System.out.println("\n Mobile Details : ");
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
		displayProcessor();
	}
}
class CopyConstructor1
{
	public static void main(String[] args) 
	{
		
	
		Processor processor = new Processor("A19","8",4.04,"Bionic");

		Mobile mobile = new Mobile("Apple","17Air",129000,processor);

		mobile.displayMobile();

		Mobile copy1 = new Mobile(mobile);
		copy1.model = "17Pro";
		copy1.price = 135000;
		copy1.displayMobile();

		System.out.println("---------------");
		
		copy1.processor.clockSpeed = 0;

		copy1.displayMobile();
		mobile.displayMobile();
	}
}
