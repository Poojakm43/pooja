package app;

public class Elevator {
	public String place;
	public int height;
	
	public void lift()
	{
		System.out.println("Invoking lift with no arguments");
		lift("mall");
		lift(50);
	}
	public void lift(int height)
	{
		System.out.println("invoking lift with int");
		System.out.println("height"+height);
	}
	public void lift(String place)
	{
		System.out.println("invoking lift of String");
		System.out.println("place"+place);
	}
	
	
	public void lift(int height,String place)
	{
	    System.out.println("invoking lift of int,String");
	    lift(place);
	    lift(height);
	}


}
