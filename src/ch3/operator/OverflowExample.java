package ch3.operator;

public class OverflowExample {
	
	/* int 값에 저장될 수 있는 값의 범위를 초과하게 된다. 그래서 쓰레기 값을 얻게 된다.
	 * int 값을 long으로 바꾸면 된다.
	 * 그러나 대부분의 데이터는 사용자로부터 입력받거나 프로그램 실행 도중에 생성되는 데이터로 산술 연산이 수행된다.
	 * 이런 경우는 산술 연산자를 사용하지 말고 메소드를 이용하는 것이 좋다.
	 * 메소드는 산술 연산을 하기 전에 피연산자들의 값을 조사해서 오버플로우를 탐지할 수 있기 때문이다. */

	public static void main(String[] args) {
		int x1 = 1000000;
		int y1 = 1000000;
		int z1 = x1 * y1;
		
		System.out.println(z1);
		
		long x2 = 1000000;
		long y2 = 1000000;
		long z2 = x2 * y2;
		
		System.out.println(z2);
	}
}
