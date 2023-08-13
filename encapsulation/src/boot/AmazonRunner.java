package boot;

import app.Amazon;

public class AmazonRunner {

	public static void main(String[] args) {
		Amazon myAmazonAccount = new Amazon();

		myAmazonAccount.setAccountName("poojakm");
		myAmazonAccount.setEmail("poojakm@gmail.com");
		myAmazonAccount.setShippingAddress("tiptur");
		myAmazonAccount.setPaymentMethod("phonepay");
		myAmazonAccount.setOrderHistory("Order 1, Order 2");
		myAmazonAccount.setWishlist("Product A, Product B");
		myAmazonAccount.setPrimeMembership("Active");
		myAmazonAccount.setCartItemCount(5);
		myAmazonAccount.setLoyaltyPoints(200);
		myAmazonAccount.setGiftCardBalance(50);
		myAmazonAccount.setAccountBalance(5000.50);
		myAmazonAccount.setVerified(true);
		myAmazonAccount.setSubscribed(true);
		myAmazonAccount.setLastLogin("2023-08-10 11:30");

		System.out.println("Account Name: " + myAmazonAccount.getAccountName());
		System.out.println("Email: " + myAmazonAccount.getEmail());
		System.out.println("Shipping Address: " + myAmazonAccount.getShippingAddress());
		System.out.println("Payment Method: " + myAmazonAccount.getPaymentMethod());
		System.out.println("Order History: " + myAmazonAccount.getOrderHistory());
		System.out.println("Wishlist: " + myAmazonAccount.getWishlist());
		System.out.println("Prime Membership: " + myAmazonAccount.getPrimeMembership());
		System.out.println("Cart Item Count: " + myAmazonAccount.getCartItemCount());
		System.out.println("Loyalty Points: " + myAmazonAccount.getLoyaltyPoints());
		System.out.println("Gift Card Balance: " + myAmazonAccount.getGiftCardBalance());
		System.out.println("Account Balance: " + myAmazonAccount.getAccountBalance());
		System.out.println("Verified: " + myAmazonAccount.isVerified());
		System.out.println("Subscribed: " + myAmazonAccount.isSubscribed());
		System.out.println("Last Login: " + myAmazonAccount.getLastLogin());

	}

}
