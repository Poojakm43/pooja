package boot;

import app.Drum;
import app.WaterDrum;

public class DrumRunner {

	public static void main(String[] args) {
		Drum drum=new WaterDrum();
		drum.fill();
	}

}
