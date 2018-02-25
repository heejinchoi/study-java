package interface8;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	//인터페이스에 선언되지 않은 메소드 (강제 타입 변환 할 것임)
	public void checkFare() {
		System.out.println("승차 요금을 체크합니다.");
	}
	
}
