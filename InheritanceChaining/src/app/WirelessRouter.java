package app;

public class WirelessRouter extends Router{
	public WirelessRouter(String port,int price,String supports,String durability)
	{
		super(port,price,supports,durability);
	}
	public WirelessRouter()
	{
		super("many",499,"encapsulation","5 years");
	}
	
}
