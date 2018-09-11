package com.example.CarRental;

public class Car {
	
	private String plateNumber;
	private int price;
	
	public Car() {
		super();
	}
	
	public Car(String plateNumber, int price) {
		super();
		this.plateNumber = plateNumber;
		this.price = price;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

}
