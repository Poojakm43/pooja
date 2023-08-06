package app;

public class Rope {
	public String type;
	public int price;
	public char size;
	public String durability;
	
	public Rope(String type,int price,char size,String durability)
	{
		System.out.println("invoking constructor with String,int,char");
		this.type=type;
		this.price=price;
		this.size=size;
		this.durability=durability;
	}

}
