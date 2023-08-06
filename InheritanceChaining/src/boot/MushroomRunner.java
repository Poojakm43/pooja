package boot;

import app.PoisonMushroom;

public class MushroomRunner {

	public static void main(String[] args) {
		PoisonMushroom mushroom=new PoisonMushroom("white",80,false,'M');
		System.out.println(mushroom.colour);
		System.out.println(mushroom.price);
		System.out.println(mushroom.edible);
		System.out.println(mushroom.size);
		
		PoisonMushroom mushroom1=new PoisonMushroom();
		System.out.println(mushroom1.colour);
		System.out.println(mushroom1.price);
		
	}
	

}
