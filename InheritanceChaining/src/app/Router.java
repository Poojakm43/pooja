package app;

public class Router {
	public String ports;
	public int price;
	public String supports;
	public String durability;
	
	public Router(String ports,int price,String supports,String durability)
	{
		System.out.println("invoking constructor with String,int");
		this.ports=ports;
		this.price=price;
		this.supports=supports;
		this.durability=durability;
	}

}
