package boot;

import app.WirelessRouter;

public class RouterRunner {

	public static void main(String[] args)
	{
		WirelessRouter router=new WirelessRouter("many",490,"filtering","5 years");
		System.out.println(router.ports);
		System.out.println(router.price);
		System.out.println(router.supports);
		System.out.println(router.durability);
		
		WirelessRouter router1=new WirelessRouter();
		System.out.println(router.supports);
		System.out.println(router.durability);
		
	}
	}


