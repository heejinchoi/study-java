package ch3.operator;

public class CharOperationExample {
	
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1; 	=> 컴파일 에러: char 타입을 연산하면 int 값이 된다.
		int c3 = c2 + 1;
		char c4 = (char) c3;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
