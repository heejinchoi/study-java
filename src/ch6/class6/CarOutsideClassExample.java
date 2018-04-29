package ch6.class6;

public class CarOutsideClassExample {
	public static void main(String[] args) {
		CarOutsideClass myCar = new CarOutsideClass();
		
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
	}
}
