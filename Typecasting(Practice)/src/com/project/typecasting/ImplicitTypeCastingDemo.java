package com.project.typecasting;

public class ImplicitTypeCastingDemo {
	public static void main(String[] args) {
		//Implicit type casting is done by automatic 
		//compiler will convert it automatically,,,,,,,,,,
		byte bytevalue=123;// 8 bits
		int intValue=bytevalue;//32 bits
		short shortValue=25;
		int intValueData=shortValue;
		short shortValue1=shortValue;
		long langValue=intValue;
		float floatData=150.35f;
	    double doubleData=floatData;
		
		System.out.println("Converting Byte to int"+intValue);
		System.out.println("Converting short to int: "+shortValue);
		System.out.println("Converting byte to short: "+shortValue1);
		System.out.println("Converting int to lang: "+langValue);
		System.out.println("Converting int to short: "+intValueData);
		System.out.println("Converting Float to double: "+doubleData);
		
	}

}
