package interface8;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		driver.drive(bus); 		//자동 타입 변환 (Vehicle vehicle = bus;)
		driver.drive(texi);		//자동 타입 변환 (Vehicle vehicle = texi;)
		
	}
}
