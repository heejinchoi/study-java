package interface8;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
		
		if(vehicle instanceof Bus) { //vehicle에 Bus와 Texi가 매개변수로 들어오는지 조사
			Bus bus = (Bus) vehicle;
			bus.checkFare();	//Bus 타입으로 강제 타입 변환을 하는 이유
		}
		vehicle.run();
	}
}
