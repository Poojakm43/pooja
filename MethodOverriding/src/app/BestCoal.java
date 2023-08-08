package app;

public class BestCoal extends Coal
{
	
	@Override
	public void burn()
	{
		super.burn();
		System.out.println("invoking burn in coal");

}
}
