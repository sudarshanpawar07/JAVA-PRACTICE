import java.util.*;
class Product
{
	static int serialNumber = 2134;
	String productId ;
	String name;
	double price;

 	Product(){
	super();
	productId = "PRODUCTID" + serialNumber++;
	
	}

	public String displayProduct()
	{
		return productId + " : " + name + " , Price : " + price + " rs."; 
	}
	
	
}
class ExampleDriver
{
	public static void main(String [] args)
	{
		ArrayList <Product> basket = new ArrayList <Product> ();
		Product p1 = new Product();
		p1.name = "marker";
		p1.price = 30;
		
		Product p2 = new Product();
		p2.name = "Duster";
		p2.price = 100;
	
		Product p3 = new Product();
		p3.name = "BlackBoard";
		p3.price = 3000;
	
		basket.add(p1);
		basket.add(p2);
		basket.add(p3);
		
		for(Product ele : basket)
		{
			System.out.println(ele.displayProduct());
		}
	

	}
}