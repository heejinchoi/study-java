package operator;

public class DenyLogicOperatorExample {

	/*논리 부정 연산자도 초기화가 필요하다.
	 * 두 사지 상태(true/false)를 번갈아가며 변경하는 토글(toggle) 기능을 구현할 때도 주로 사용한다.*/
	
	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
	}
}
