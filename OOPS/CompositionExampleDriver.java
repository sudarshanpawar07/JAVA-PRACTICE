class Engine
{
	String type;
	String transmission;
	int pistons;
	double bhp;
	double capacity;
	int gears;

	Engine(String type,String transmission,int pistons,double bph,double capacity,int gears)
	{
		this.type = type;
		this.transmission = transmission;
		this.pistons = pistons;
		this.bhp = bph;
		this.capacity = capacity;
		this.gears = gears;

	}

	public void displayEngine()
	{
		System.out.println("Engine Details : ");
		System.out.println("type : " + type);
		System.out.println("transmission : " + transmission);
		System.out.println("pistons : " + pistons);
		System.out.println("BHP : " + bhp);
		System.out.println("capacity : " + capacity);
		System.out.println("Gears : " + gears);
	}

	public void startEngine()
	{
		System.out.println("ENGINE HAS STARTED ");

	}
}
class Car
{
	String brand;
	String model;
	String color;
	double price;
	Engine engine;

	Car(String model , String brand,String color, double price)
	{
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.engine = new Engine("Petrol","MANUAL",4,450,2500,6);

	}

	public  void displayCar()
	{
		System.out.println("Car details : ");
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Color : " + color);
		System.out.println("Price : " + price);

	}
}
class CompositionExampleDriver
{
	public static void main(String[] args) 
	{
		Car object = new Car("Fortuner","TOYOTA","Black",500000);
		object.displayCar();
		object.engine.displayEngine();
		object.engine.startEngine();

	}
	
}