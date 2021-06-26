package com.akter;

public class Car extends Vehicle {
	
	
	public Car(int noOfWheel, String color, String brand) {
		super.noOfWheels=noOfWheel;
		super.color=color;
		super.brand=brand;
	}
	
	public Car() {
		super.noOfWheels=getNoofWheelint();
		super.color=getColor();
		super.brand=getBrand();
	}
	

	@Override
	public void drive() {
		System.out.println("Car is driving");
		
	}

	@Override
	public void park() {
		System.out.println("Car is  parked");
		
	}
	public void setNoofWheelint(int noOfWheels) {
		super.noOfWheels=noOfWheels;
	}
	
	public void setColor(String color) {
		super.color=color;
	}
	
	public void setbrand(String brand) {
		super.brand=brand;
	}

	
	
	public int getNoofWheelint() {
		return super.noOfWheels;
	}
	
	public String getColor() {
		return super.color;
	}
	
	public String getBrand() {
		return super.brand=brand;
	}
}
