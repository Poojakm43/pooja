package app;

public class Stapler {
	public String brand;
	public int price;
	
	public void punch()
	{
		System.out.println("Invoking punch with no arguments");
		punch(150);
		punch("apsara");
	}
	public void punch(int price)
	{
		System.out.println("invoking price of int");
		System.out.println("price"+price);
	}
	public void punch(String brand)
	{
		System.out.println("invoking punch of String");
		System.out.println("brand"+brand);
	}
	
	
	public void punch(int price,String brand)
	{
	    System.out.println("invoking punch of int,String");
	    punch(price);
	    punch(brand);
	}


}
