package ch6.class6;

public class CarInstanceExample {
	public static void main(String[] args) {
		CarInstance myCar = new CarInstance("포르쉐");
		CarInstance yourCar = new CarInstance("벤츠");
		
		myCar.run();
		yourCar.run();
	}
}
