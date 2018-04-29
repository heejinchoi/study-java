package ch3.operator;

public class InfinityAndNaNCheckExample {
	
	/* '/' 또는 '%' 연산을 할 때의 주의사항
	 * 
	 * 좌측 피연산자가 정수 타입인 경우 나누는 수인 우측 피연산자는 0을 사용할 수 없다.
	 * 만일 0으로 나누면 컴파일은 정상적으로 되지만, 실행 시 ArithmeticException(예외)이 발생한다.
	 * 
	 * 그러나 실수 타입인 0.0 또는 0.0f로 나누면 ArithmeticException이 발생하지 않고, '/'연산의 결과는 Infinity(무한대) 가지며,
	 * '%'의 연산의 결과는 NaN(Not a Number)을 가진다.
	 * 
	 * isInfinite()
	 * isNaN() */
	
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z1 = x / y;
		double z2 = x % y;
		
		System.out.println(Double.isInfinite(z1));
		System.out.println(Double.isNaN(z1));
		System.out.println("/연산의 결과: "+z1 + 2); //Infinity 값에  산술 연산이 되지 않음

		System.out.println(Double.isInfinite(z2));
		System.out.println(Double.isNaN(z2));
		System.out.println("%연산의 결과: "+z2 + 2); //NaN 값에 산술 연산이 되지 않음
		
	}

}
