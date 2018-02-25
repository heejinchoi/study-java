package class6;

//정적 메소드와 블록 선언 시 주의할 점: 정적 메소드와 블록 내부에 인스턴스 필드나 인스턴스 메소드는 사용할 수 없다.
//정적 메소드와 정벅 블록에서 인스턴스 멤버를 사용하고 싶다면 객체를 먼저 생성하고 참조 변수로 접근해야 한다.
public class StaticInstance {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		StaticInstance myCar = new StaticInstance();
		myCar.speed = 60;
		myCar.run();
	
	}
}
