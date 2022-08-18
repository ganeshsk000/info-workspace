package com.project.uncheckedexception;

public class WatsappException1 extends Exception {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	String message;

	public WatsappException1(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

}
