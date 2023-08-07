package app;

public class Specs {
	public String type;
	public double power;
	
	public void lens()
	{
		System.out.println("Invoking lens with no arguments");
		lens(1.5);
		lens("concave");
	}
	public void lens(double power)
	{
		System.out.println("invoking lense of String");
		System.out.println("power"+power);
	}
	public void lens(String type)
	{
		System.out.println("invoking lense of String");
		System.out.println("type"+type);
	}
	
	
	public void lens(double power,String type)
	{
	    System.out.println("invoking lense of power,String");
	    lens(power);
	    lens(type);
	}

}
