package ch7.inheritance.package2;

import ch7.inheritance.package1.A;

public class C {
	public void method() {
		//A a = new A(); 	=> A가 protected 접근제한 이기 때문에 다른 패키지에서는 사용할 수 없음
		//a.field = "value";
		//a.method();
	}
}
