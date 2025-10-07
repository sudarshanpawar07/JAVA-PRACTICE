class Vehicle
{
	String model;
	String  brand;
	double price;
	String manufacturingDate;

	Vehicle(String model,String brand,double price,String manufacturingDate)
	{
		super();
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.manufacturingDate = manufacturingDate;
	}

	public  void getVehicleDetails()
	{
		System.out.println("Vehicle Details");
		System.out.println("model " + model);
		System.out.println("Price : " + price);
		System.out.println("model : " + model);
		System.out.println("manufacturingDate : " + manufacturingDate);
	}

	
}

class Car extends Vehicle
{
	boolean ac;
	int airBags;
	int door;
	boolean sunroof;
	String fuelType;

	Car(String model,String brand,double price,String manufacturingDate,
		boolean ac,int airBags,boolean sunroof,int door ,String fuelType)
	{
		super(model,brand, price,manufacturingDate);
		this.ac = ac;
		this.airBags = airBags;
		this.door = door;
		this.fuelType = fuelType;
	}

		public  void getCarDetails()
		{
			System.out.println("Car details ");
			System.out.println("Ac : " + ac);
			System.out.println("Doors : " + door);
			System.out.println("sunroof : " + sunroof);
			System.out.println("fuelType : " + fuelType);
			System.out.println("airBags : " + airBags);
		}


	public void VehicleStart()
	{
		System.out.println("Press button to start Car ");
	}

	public void accelerate()
	{
		System.out.println("Use a pedal to move Vehicle ");
	}
}

class SingleInheritance
{
	public static void main(String[] args) 
	{
		//boolean ac,int airBags,boolean sunroof,int door ,String fuelType)
		Car obj = new Car("g-class","benz",3000000,"17/08/2022",true,2,true,4,"Petrol");
		obj.getVehicleDetails();
		obj.getCarDetails();
	}
}