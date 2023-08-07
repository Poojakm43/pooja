package app;

public class Gadget {
	public String name;
	public int price;
	
	public void mix()
	{
		System.out.println("Invoking mix with no arguments");
		mix("grinder");
		mix(950);
	}
	public void mix(int price)
	{
		System.out.println("invoking mix with int");
		System.out.println("price"+price);
	}
	public void mix(String name)
	{
		System.out.println("invoking mix of String");
		System.out.println("name"+name);
	}
	
	
	public void mix(int price,String name)
	{
	    System.out.println("invoking mix of int,String");
	    mix(name);
	    mix(price);
	}

}
