package ch8.interface8;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRigthTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRigthTire.roll();
	}
	
	//구현 객체를 배열로 관리
	Tire[] tires = {
		new HankookTire(),	
		new HankookTire(),	
		new HankookTire(),	
		new HankookTire()	
	};
	
	void run2() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
