package app;

public class Mushroom {
	public String colour;
	public int price;
	public boolean edible;
	public char size;
	
	public Mushroom(String colour,int price,boolean edible,char size)
	{
		System.out.println("invoking constructor with String,int,boolean,char");
		this.colour=colour;
		this.price=price;
		this.edible=edible;
		this.size=size;
	}

}
