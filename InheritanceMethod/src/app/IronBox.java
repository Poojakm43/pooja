package app;

public class IronBox {
	public String model;
	public int price;
	
	public void type()
	{
		System.out.println("Invoking type with no arguments");
		type("new");
		type(750);
	}
	public void type(int price)
	{
		System.out.println("invoking type with int");
		System.out.println("price"+price);
	}
	public void type(String model)
	{
		System.out.println("invoking type of String");
		System.out.println("model"+model);
	}
	
	
	public void type(int price,String model)
	{
	    System.out.println("invoking type of int,String");
	    type(price);
	    type(model);
	}


}
