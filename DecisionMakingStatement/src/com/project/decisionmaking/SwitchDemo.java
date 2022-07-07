package com.project.decisionmaking;

public class SwitchDemo {
	public static void main(String[] args) {
		String trafficSignal = "Green";

		switch (trafficSignal) {
		case "Red":
			System.out.println("please stop the vehicle,,,,,,,,,");
			break;
		case "Yellow":
			System.out.println("ready for move,,,,,,,,,,,,");
			break;
		case "Green":
			System.out.println("You can move freely,,,,,,,,,,");
			break;
		default:
			System.out.println("please enter valid condition,,,,,,,,,");
		}
	}

}
