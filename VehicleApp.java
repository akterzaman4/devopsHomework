package com.akter;

public class VehicleApp {

	public static void main(String[] args) {
		Car car = new Car(4, "Silver", "Honda");
		car.drive();
		car.park();
		
		System.out.println(car.getNoofWheelint());
		System.out.println(car.getColor());
		System.out.println(car.getBrand());
		
		
		Car car2 = new Car();
		
		car2.setNoofWheelint(8);
		car2.setColor("Black");
		car2.setbrand("Ford");
		System.out.println(car2.getNoofWheelint());
		System.out.println(car2.getColor());
		System.out.println(car2.getBrand());
	}

}
