package boot;

import app.Umbrella;

public class UmbrellaRunner {

	public static void main(String[] args) {
		Umbrella umbrella=new Umbrella();
		umbrella.cover();
		umbrella.cover(250,"blue");


	}

}
