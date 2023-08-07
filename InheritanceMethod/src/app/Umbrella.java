package app;

public class Umbrella {
	public String colour;
	public int price;
	
	public void cover()
	{
		System.out.println("Invoking cover with no arguments");
		cover("blue");
		cover(250);
	}
	public void cover(int price)
	{
		System.out.println("invoking type with int");
		System.out.println("price"+price);
	}
	public void cover(String colour)
	{
		System.out.println("invoking cover of String");
		System.out.println("colour"+colour);
	}
	
	
	public void cover(int price,String colour)
	{
	    System.out.println("invoking cover of int,String");
	    cover(price);
	    cover(colour);
	}


}
