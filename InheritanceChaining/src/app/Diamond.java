package app;

public class Diamond {
	public String type;
	public float price;
	public boolean edible;
	public char size;
	
	public Diamond(String type,float price,boolean edible,char size)
	{
		System.out.println("invoking constructor with String,float,boolean,char");
		this.type=type;
		this.price=price;
		this.edible=edible;
		this.size=size;
	}

}
