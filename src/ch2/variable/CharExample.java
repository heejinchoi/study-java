package ch2.variable;
public class CharExample {
	
	/*char 타입은 모든 문자를 유니코드로 처리한다.
	 * 유니코드는 0~65535 범위의 2byte 크기를 가진 정수값이다.*/
	
	public static void main(String[] args) {
		char c1 = 'A'; //문자를 직접 저장
		char c2 = 65; //10진수로 저장
		char c3 = '\u0041'; //16진수로 저장
		
		char c4 = '가'; //문자를 직접 저장
		char c5 = 44032; //10진수로 저장 
		char c6 = '\uac00';
		
		int uniCode = c1; //유니코드 얻기
		int uniCode2 = c5;
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.println("c4: " + c4);
		System.out.println("c5: " + c5);
		System.out.println("c6: " + c6);
		System.out.println("uniCode: " + uniCode);
		System.out.println("uniCode2: " + uniCode2);
		
	}
}
