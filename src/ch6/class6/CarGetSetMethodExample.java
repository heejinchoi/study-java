package ch6.class6;

public class CarGetSetMethodExample {
	public static void main(String[] args) {
		CarGetSetMethod myCar = new CarGetSetMethod();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);

		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: "  + myCar.getSpeed());
	}
}
