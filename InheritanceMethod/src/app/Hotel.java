package app;

public class Hotel {
	public String location;
	public int dishCost;
	
	public void taste()
	{
		System.out.println("Invoking taste with no arguments");
		taste("davangere");
		taste(50);
	}
	public void taste(int dishCost)
	{
		System.out.println("invoking taste with int");
		System.out.println("dishCost"+dishCost);
	}
	public void taste(String location)
	{
		System.out.println("invoking taste of String");
		System.out.println("location"+location);
	}
	
	
	public void taste(int dishCost,String location)
	{
	    System.out.println("invoking taste of int,String");
	    taste(location);
	    taste(dishCost);
	}

}
