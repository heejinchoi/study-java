package inheritance;

public class SupersonicAirplane extends Airplane {
	//부모클래스의 메소드 오버라이딩 & 호출 - super
	
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}
		else {
			//Airplane 객체의 fly() 메소드 호출
			super.fly();
		}
	}
}
