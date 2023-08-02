package app;

import boot.EightLevel;
import boot.FiveLevel;
import boot.FourLevel;
import boot.Hierarchy;
import boot.SevenLevel;
import boot.SingleLevel;
import boot.SixLevel;
import boot.ThreeLevel;
import boot.TwoLevel;

public class HierarchyRunner {

	public static void main(String[] args) {
		System.out.println("invoke main in the HierarchyRunner");
		Hierarchy hierarchy=new Hierarchy();
		hierarchy.Tree("guva tree");
		Hierarchy hierarchy1=new SingleLevel();
		hierarchy1.Root("plant root");
		Hierarchy hierarchy2=new TwoLevel();
		hierarchy2.Leaf("curry leaves");
		Hierarchy hierarchy3=new ThreeLevel();
		hierarchy3.Stem("Main part of plant");
		Hierarchy hierarchy4=new FourLevel();
		hierarchy4.Flower("flower is blooming");
		Hierarchy hierarchy5=new FiveLevel();
		hierarchy5.Fruit("mango");
		Hierarchy hierarchy6=new SixLevel();
		hierarchy6.Bud("Multi stem jiont");
		Hierarchy hierarchy7=new SevenLevel();
		hierarchy7.Seed("Germination of plant");
		Hierarchy hierarchy8=new EightLevel();
		hierarchy8.Soil("help for plant growing");

	}

}
