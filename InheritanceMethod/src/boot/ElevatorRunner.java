package boot;

import app.Elevator;

public class ElevatorRunner {

	public static void main(String[] args) {
		Elevator elevator=new Elevator();
		elevator.lift();
		elevator.lift(50,"mall");

	}

}
