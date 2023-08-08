package app;

public class BusTicket extends Ticket{
	public void journey()
	{
		super.journey();
		System.out.println("invoking journey in BusTicket");
	}

}
