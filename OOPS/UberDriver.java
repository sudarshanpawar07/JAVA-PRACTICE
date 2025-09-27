import java.util.*;
class Driver
{
	private String name;
	private long contact;

	Driver(String name , long contact)
	{
		this.name = name;
		this.contact = contact;
	}

	public void getDriver()
	{
		System.out.println("\n DRIVER INFO ");
		System.out.println("Driver : " + name);
		System.out.println("Contact : " + contact + "\n");
	}
}
class Cab
{
	static int id = 353535;
	private Driver driver;
	private String number;
	private String uberId;
	private String type;
	private int capacity;
	private String status = "AVAIL";
	private String location = "DECCAN";

	String [] typeVehicle = {"hatchback","sedan","suv","muv"};
	int [] vehicleCapacity = {3,4,5,6};

	{
		this.uberId = "UBER" + id++;
	}
	Cab(String number , String type)
	{
		this.number = number;
		this.type = type.toLowerCase();

		int indx = 0;
		for (String element : typeVehicle ) {
			if(type.toLowerCase().equals(element))
			{
				break;
			}
			indx++;

			
		}
		this.capacity = vehicleCapacity[indx];
		System.out.println("Enter the Driver details :");
		System.out.print("Enter a name : ");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Enter the Contact number : ");
		long contact = new Scanner(System.in).nextLong();
		this.driver = new Driver(name,contact);
	}

	public void getCabDetails()
	{
		System.out.println("\n CAB DETAILS ");
		System.out.println("Uber Id : " + uberId);
		System.out.println("Status : " + status);
		System.out.println("Cab Number : "  + number);
		System.out.println("type : " + type);
		System.out.println("capacity : " + capacity);
		System.out.println("Locatiuon : " + location);
		driver.getDriver();
		System.out.println("");
	}
	
}
class UberDriver
{
	public static void main(String[] args) {
		System.out.println("\n WELCOME \n");
		System.out.print("Enter the Cab number :");
		String cabNumber = new Scanner(System.in).next();
		System.out.println("type of cab : ");
		String type = new Scanner(System.in).next();
		Cab cab1 = new Cab(cabNumber,type);
		cab1.getCabDetails();
		
	}
	
}