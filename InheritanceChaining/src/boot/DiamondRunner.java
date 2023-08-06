package boot;

import app.ArtificialDiamond;

public class DiamondRunner {

	public static void main(String[] args) {
		ArtificialDiamond diamond=new  ArtificialDiamond("necklace",800000.9f,false,'s');
		System.out.println(diamond.type);
		System.out.println(diamond.price);
		System.out.println(diamond.edible);
		System.out.println(diamond.size);
		
		 ArtificialDiamond diamond1=new  ArtificialDiamond();
		System.out.println(diamond1.type);
		System.out.println(diamond1.size);

	}

}
