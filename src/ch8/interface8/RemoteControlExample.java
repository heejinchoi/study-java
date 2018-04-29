package ch8.interface8;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		//익명 구현 객체
		RemoteControl rc2 = new RemoteControl() {
			@Override
			public void turnOn() {
				//실행문
			}
			@Override
			public void turnOff() {
				//실행문
			}
			@Override
			public void setVolume(int volume) {
				//실행문
			}
		};
		
		
		//추상 메소드의 사용
		RemoteControl rc3 = null;
		rc3 = new Television();
		rc3.turnOn();
		rc3.turnOff();
		
		rc3 = new Audio();
		rc3.turnOn();
		rc3.turnOff();
		
		//디폴트 메소드 재정의
		RemoteControl rc4 = null;
		rc4 = new Television();
		rc4.setMute(true);
		rc4 = new Audio();
		rc4.setMute(true); //Audio 클래스만 디폴트 메소드를 재정의 했음
		
		
		//정적 메소드의 사용
		RemoteControl.changeBattery();

	}
}
