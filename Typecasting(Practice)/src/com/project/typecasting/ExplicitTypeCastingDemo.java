package com.project.typecasting;

public class ExplicitTypeCastingDemo {
	public static void main(String[] args) {
		//it is done by programmer only,,,,,,,,
		short shortValue=135;
		byte byteValue=(byte)shortValue;
		int intValue=250;
		
		short shortValueInt=(short)intValue;
		long longValue=123456645634l;
		int intValueLong=(int)longValue;
		double doubleValue=452234.545434d;
        float floatValue=(float)doubleValue;		
		System.out.println("Converting short into byte"+byteValue);
		System.out.println("Converting int into short"+shortValueInt);
		System.out.println("Converting longValue into intValue: "+intValueLong);
		System.out.println("Converting double value into float value: "+floatValue);
	}

}
