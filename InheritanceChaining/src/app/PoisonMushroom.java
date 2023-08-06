package app;

public class PoisonMushroom extends Mushroom{
	
	public PoisonMushroom(String colour,int price,boolean edible,char size)
	{
		super(colour,price,edible,size);
	}
	public PoisonMushroom()
	{
		super("grey",90,false,'s');
	}
	

}
