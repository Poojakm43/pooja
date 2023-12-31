package main;

import overload.FiveStarHotel;
import overload.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		Hotel hotel=new Hotel();

		hotel.roomFacility();
		System.out.println("HAS FOOd Facility : "+hotel.roomFacility(true));
		hotel.roomFacility(5000);
		hotel.roomFacility("COLORS");
		hotel.roomFacility(1000,90);
		hotel.roomFacility("SiriMane", 2000, 101);

		System.out.println("==============");

		Hotel hotel1=new FiveStarHotel();				//override with parent class ref

		hotel1.roomFacility();
		System.out.println("HAS FOOd Facility : "+hotel1.roomFacility(false));
		hotel1.roomFacility(8000);
		hotel1.roomFacility("OTP");
		hotel1.roomFacility(3000,90);
		hotel1.roomFacility("CFD", 300, 202);

		System.out.println("==================");

		FiveStarHotel hotel2=new FiveStarHotel();//override with SUb class ref

		hotel2.roomFacility();
		System.out.println("HAS FOOd Facility : "+hotel2.roomFacility(true));
		hotel2.roomFacility(900);
		hotel2.roomFacility("RAMESHWARA CAFE");
		hotel2.roomFacility(700,90);
		hotel2.roomFacility("District 17", 8000, 303);

		
	}

}
