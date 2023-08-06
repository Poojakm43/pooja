package boot;

import app.MalnadCoffee;

public class CoffeeRunner {

	public static void main(String[] args) {
		MalnadCoffee coffee=new MalnadCoffee("sunrise",80.f,false,"bitter");
		System.out.println(coffee.name);
		System.out.println(coffee.price);
		System.out.println(coffee.edible);
		System.out.println(coffee.taste);
		
		MalnadCoffee coffee1=new MalnadCoffee();
		System.out.println(coffee1.name);
		System.out.println(coffee1.price);

	}

}
