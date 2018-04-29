package ch7.inheritance.package2;

import ch7.inheritance.package1.A;

public class D extends A {
	//protected 접근 제한자를 다른 패키지에서 사용하려며 상속해 주어야 한다.
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
