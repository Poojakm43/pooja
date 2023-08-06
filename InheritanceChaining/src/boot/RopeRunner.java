package boot;

import app.OldRope;

public class RopeRunner {

	public static void main(String[] args) {
		OldRope rope=new OldRope("cotton",450,'l',"1 year");
		System.out.println(rope.type);
		System.out.println(rope.price);
		System.out.println(rope.size);
		System.out.println(rope.durability);
		
		OldRope rope1=new OldRope();
		System.out.println(rope1.type);
		System.out.println(rope1.durability);
		
	}

}


