package interface8;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); 	=> Vehicle 인터페이스에 선언되어 있지 않고 구현 클래스인 Bus에 선언되어 있는 메소드 checkFare()를 인터페이스에서 바로 사용할 수 없다.
		
		Bus bus = (Bus) vehicle;	//강제 타입 변환
		
		bus.run();
		bus.checkFare();
		
	}
}
