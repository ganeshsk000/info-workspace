package com.project.overriding;

public class Hdfc extends RBI{
public static final float INTREST_RATE=14.5f;
	@Override
	public void displayIntrestRate() {
		System.out.println("Intrest rate for HDFC: "+INTREST_RATE);
	}
}
