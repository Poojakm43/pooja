package app;

import boot.MobileShowroom;
import boot.Showroom;
import boot.ShowroomUtil;
import boot.WatchShowroom;

public class ShowroomRunner {

	public static void main(String[] args) {
		Showroom showroom = new Showroom();
		System.out.println(showroom.openTiming);

		ShowroomUtil showroomUtil = new ShowroomUtil();
		showroomUtil.showroomUtil(showroom);

		WatchShowroom showroom2 = new WatchShowroom();
		showroomUtil.showroomUtil(showroom2);
		System.out.println(showroom2.watchName);

		MobileShowroom mobileShowroom = new MobileShowroom();
		showroomUtil.showroomUtil(mobileShowroom);
		System.out.println(mobileShowroom.price);
	}

	}


