package boot;

import app.Stapler;

public class StaplerRunner {

	public static void main(String[] args) {
		Stapler stapler=new Stapler();
		stapler.punch();
		stapler.punch(150,"apsara");

	}

}
