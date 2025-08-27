class Mobile
{
	String brand;
	String model;
	double price;
	int storage;
	String color;
	String processor;
	int ram;
	double screenSize;
	double weight;

	public void displayMobileInfo()
	{
		System.out.println(" \n Mobile info ");
		System.out.printf("brand : %s%n",brand);
		System.out.printf("model : %s%n",model);
		System.out.printf("Price : %s rs%n",price);

		System.out.printf("Storage: %d gb%ncolor : %s%n",storage,color);
		System.out.printf("Processor : %s%nRam : %d gb %n",processor,ram);
		System.out.printf("ScreenSize: %f inches%nweight : %f gram%n",screenSize,weight);


	}
}
class MobileDriver
{
	public static void main(String [] args)
	{	
		Mobile obj = new Mobile();
		obj.brand = "SAMSUNG";
		obj.model = "25 ULTRA";
		obj.price = 13000;
		obj.storage = 1024;
		obj.color = "BLACK";	
		obj.processor = "SNAP DRAGON";
		obj.ram = 12;	
		obj.screenSize = 7.8;
		obj.weight = 210;
		obj.displayMobileInfo();
		
		Mobile obj1= new Mobile();
		obj1.brand = "APPLE";
		obj1.model = "Iphone 16";
		obj1.price = 70000;
		obj1.storage = 512;
		obj1.color = "BLACK";	
		obj1.processor = "MediaTek";
		obj1.ram = 12;	
		obj1.screenSize = 9.8;
		obj1.weight = 350;
		obj1.displayMobileInfo();

	}

}