package ch8.interface8;

public class CarExample {
	public static void main(String[] args) {
		Car myCar =  new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
		System.out.println();
		
		//구현 객체를 배열로 관리
		myCar.run2();
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run2();
	}

}
