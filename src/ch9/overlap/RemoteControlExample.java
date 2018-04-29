package ch9.overlap;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl2 rc = new RemoteControl2();
		
		//익명 객체 필드 사용
		rc.field.turnOn();
		
		//익명 객체 로컬 변수 사용
		rc.method1();
		
		//익명 객체 매개값 사용
		rc.method2(
			new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("SmartTV를 켭니다.");
				}

				@Override
				public void turnOff() {
					System.out.println("SmartTV를 끕니다.");
				}
				
			}
				
		);
	}

}
