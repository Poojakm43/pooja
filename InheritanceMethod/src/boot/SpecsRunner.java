package boot;

import app.Specs;

public class SpecsRunner {

	public static void main(String[] args) {
		Specs specs=new Specs();
		specs.lens();
		specs.lens(1.3,"convex");

	}

}
