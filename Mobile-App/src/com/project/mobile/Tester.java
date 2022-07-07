package com.project.mobile;

public class Tester {
	public static void main(String[] args) {
		
		Mobile mobile=new Mobile();
		mobile.slno=101;
		mobile.name="vivo-pro";
//		mobile.brand="Vivo";
		mobile.color="block";
		mobile.isFingerPrintSupported=true;
		mobile.price=25000.00;
		mobile.uniqueNumber=34535354534l;
		mobile.playingGames();
		mobile.talkingWithFriends();
		
		System.out.println(mobile.slno);
		System.out.println(mobile.name);
		System.out.println(Mobile.brand);
		System.out.println(mobile.color);
		System.out.println(mobile.isFingerPrintSupported);
		System.out.println(mobile.uniqueNumber);
		System.out.println("************************");
		
		Mobile mobile1=new Mobile();
		mobile1.slno=101;
		mobile1.name="vivi 1.2 pro";
//		mobile1.brand="Vivo"
		mobile1.color="Red";
		mobile1.uniqueNumber=3534634646l;
		mobile1.isFingerPrintSupported=false;
		mobile1.price=25000.00;
		mobile1.playingGames();
		mobile1.talkingWithFriends();
		System.out.println(mobile1.slno);
		System.out.println(mobile1.name);
		System.out.println(Mobile.brand);
		System.out.println(mobile1.color);
		System.out.println(mobile1.isFingerPrintSupported);
		System.out.println(mobile1.uniqueNumber);
		
		
		
	}

}
