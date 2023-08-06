package app;

public class Coffee {
	public String name;
	public float price;
	public boolean edible;
	public String taste;
	
	public Coffee(String name,float price,boolean edible,String taste)
	{
		System.out.println("invoking constructor with String,float,boolean");
		this.name=name;
		this.price=price;
		this.edible=edible;
		this.taste=taste;
	}

}
