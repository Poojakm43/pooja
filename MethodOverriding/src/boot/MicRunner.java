package boot;

import app.HiddenMic;
import app.Mic;

public class MicRunner {

	public static void main(String[] args) {
		Mic mic =new HiddenMic();
		mic.speaker();

	}

}
