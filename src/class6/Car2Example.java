package class6;

public class Car2Example {
	public static void main(String[] args) {
		Car2 car2 = new Car2("검정", 3000);
		//Car2 car2 = new Car2(); 	=> 기본 생성자를 호출할 수 없다.
		
		System.out.println(car2.color + ", " + car2.speed );
		
	}
}
