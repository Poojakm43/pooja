package overload;

public class BestBakery extends Bakery{
	public void sweet()
	{
		System.out.println("invoking sweet in bakery");
	}
	@Override
	public void sweet(String name)
	{
		super.sweet(name);
		System.out.println("invoking String name in sweet");
		System.out.println("name is:"+name);
	}
	@Override
	public void sweet(String name,String location)
	{
		super.sweet(name,location);
		System.out.println("invoking String name,location in sweet");
		System.out.println("name is:"+ name);
		System.out.println("location is:"+location);
		
	}
	
	
	
	
	
}
