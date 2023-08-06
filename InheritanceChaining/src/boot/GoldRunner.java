package boot;

import app.RoldGold;

public class GoldRunner {

	public static void main(String[] args) {
		RoldGold gold=new RoldGold("doller",80000.9f,false,'s');
		System.out.println(gold.type);
		System.out.println(gold.price);
		System.out.println(gold.edible);
		System.out.println(gold.size);
		
		RoldGold gold1=new RoldGold();
		System.out.println(gold1.type);
		System.out.println(gold1.size);

	}

}
