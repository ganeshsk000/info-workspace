package com.project.wallet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ATMCard {
	@Value("456545465643")
	private long cardNo;
	@Value("433")
	private int cvv;
	@Value("blue")
	private String color;
	public ATMCard() {
		System.out.println("Object is created: "+this.getClass().getName());
	}
	public ATMCard(long cardNo, int cvv, String color) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.color = color;
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "ATMCard [cardNo=" + cardNo + ", cvv=" + cvv + ", color=" + color + "]";
	}
	

}
