package associationarray;

public class Ingredient {
	public String name;
	public int quantity;
	public float cost;
	
public Ingredient(String name, int quantity, float cost)
{
	 this.name=name;
	 this.quantity=quantity;
	 this.cost=cost;
}
public void printInfo()
{
	System.out.println("Info of Ingredients");
	System.out.println(this.name);
	System.out.println(this.quantity);
	System.out.println(this.cost);
}
}
