package app;

public class ArtificialDiamond extends Diamond
{
	public ArtificialDiamond(String type,float price,boolean edible,char size)
	{
		super(type,price,edible,size);
	}
	public ArtificialDiamond()
	{
		super("necklace",800000.9f,false,'s');
	}
}


