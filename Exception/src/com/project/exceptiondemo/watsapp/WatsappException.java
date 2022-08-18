package com.project.exceptiondemo.watsapp;

public class WatsappException extends RuntimeException {
public String getMessage() {
	return "cant create group more than 5 members";
}
public String toString() {
	return "cant upload more than 1 Gb";
}
}
