package ch7.inheritance;

public class SportsCar extends Car {
	//final 키워드를 붙인 부모 클래스를 재정의 할 수 없음
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
/*	//오버라이딩을 할 수 없다.
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}	*/
}
