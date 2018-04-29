package ch6.class6;

public class Singleton {
	
	//접근제한자 + static(정적 필드 선언) + 싱글톤 객체 생성
	private static Singleton singleton = new Singleton();
	
	//싱글톤 생성자
	private Singleton() {
		
	}
	
	//싱글톤 메소드 - getInstance()
	static Singleton getInstance() {
		return singleton;
	}
	
}
