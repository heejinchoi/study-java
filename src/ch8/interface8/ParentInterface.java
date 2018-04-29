package ch8.interface8;

//디폴트 메소드가 있는 인터페이스의 상속
public interface ParentInterface {
	public void method1();
	
	public default void method2() {
		
	}

}
