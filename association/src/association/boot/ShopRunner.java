package association.boot;

import association.app.Shop;

public class ShopRunner {

	public static void main(String[] args) {
		
			System.out.println("Invoking main in ShopRunner");
			
			Shop shop = new Shop();
			shop.purchase();
			shop.owner();
		}

	}


