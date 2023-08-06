package app;

public class MalnadCoffee extends Coffee{
	public MalnadCoffee(String name,float price,boolean edible,String taste)
	{
		super(name,price,edible,taste);
	}
	public MalnadCoffee()
	{
		super("sunrise",80.9f,false,"bitter");
	}

}
