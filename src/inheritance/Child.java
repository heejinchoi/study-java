package inheritance;

public class Child extends Parent {
	//부모 클래스의 메소드 재정의
	@Override
	public void method2() {
		System.out.println("Chile-method2");
	}
	
	public void method3() {
		System.out.println("Child-method3");
	}
}
