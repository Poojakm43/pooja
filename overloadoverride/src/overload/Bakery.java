package overload;

public class Bakery {
	public String name;
	public String location;
	public String area;
	public boolean ediblity;
	public int cost;
	public String dish;
	
	
	public void sweet() 
	{
		System.out.println("invoking no arguments sweet in Bakery");
	}
	
	public void sweet(String name)
	{
		System.out.println("invoking String name in biscuit");
	}
	public void sweet(String name,String location)
	{
		System.out.println("invoking String in biscuit");
	}
	public void sweet(String name,String location,String area)
	{
		System.out.println("invoking Strings in biscuit");
	}
	public void sweet(String name,String location,String area,boolean ediblity)
	{
		System.out.println("invoking String and boolean name in biscuit");
	}
	public void sweet(String name,String location,String area,boolean ediblity,int cost,String dish)
	{
		System.out.println("invoking Strings boolean int in biscuit");
	}

}
