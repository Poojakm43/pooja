package app;

public class HiddenMic extends Mic
{
	public void speaker()
	{
	super.speaker();
	System.out.println("invoking speaker in hiddenmic");
	}

}
