package boot;

import app.Cred;

public class CredRunner {

	public static void main(String[] args) {
		Cred myCredAccount = new Cred();

		myCredAccount.setUserName("poojamanjunath");
		myCredAccount.setFullName("Pooja K M");
		myCredAccount.setEmail("poojakm@gmail.com");
		myCredAccount.setPhoneNumber("+8088090768");
		myCredAccount.setAddress("4th block , Rajajinagar");
		myCredAccount.setCreditCardNumber("1234-1111-6756-0000");
		myCredAccount.setCardExpirationDate("12/23");
		myCredAccount.setCardHolderName("Pooja K M");
		myCredAccount.setBillingAddress("500 Billing, Bengalore");
		myCredAccount.setRewardsPoints(500);
		myCredAccount.setCreditLimit(10000.00);
		myCredAccount.setPremium(true);
		myCredAccount.setVerified(true);

		System.out.println("User Name: " + myCredAccount.getUserName());
		System.out.println("Full Name: " + myCredAccount.getFullName());
		System.out.println("Email: " + myCredAccount.getEmail());
		System.out.println("Phone Number: " + myCredAccount.getPhoneNumber());
		System.out.println("Address: " + myCredAccount.getAddress());
		System.out.println("Credit Card Number: " + myCredAccount.getCreditCardNumber());
		System.out.println("Card Expiration Date: " + myCredAccount.getCardExpirationDate());
		System.out.println("Card Holder Name: " + myCredAccount.getCardHolderName());
		System.out.println("Billing Address: " + myCredAccount.getBillingAddress());
		System.out.println("Rewards Points: " + myCredAccount.getRewardsPoints());
		System.out.println("Credit Limit: " + myCredAccount.getCreditLimit());
		System.out.println("Premium: " + myCredAccount.isPremium());
		System.out.println("Verified: " + myCredAccount.isVerified());

	}

}
