package boot;

import app.Bangle;
import app.GoldBangle;

public class BangleRunner {

	public static void main(String[] args) {
		Bangle bangle=new GoldBangle();
		bangle.sound();
	}

}
