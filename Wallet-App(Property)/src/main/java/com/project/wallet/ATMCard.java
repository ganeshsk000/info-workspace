package com.project.wallet;

public class ATMCard {
	private long cardNo;
	private int cvv;
	private String color;
	public ATMCard() {
		super();
		// TODO Auto-generated constructor stub
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
