package ch11.api2;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();		//StringBuilder 객체 생성
		
		sb.append("JAVA ");		//문자열 끝에 추가
		sb.append("Program Study");		//문자열 끝에 추가
		System.out.println(sb.toString());
		
		sb.insert(4, "2");		//4번째 문자 뒤에 2를 삽입	
		System.out.println(sb.toString());		
	
		sb.setCharAt(4, '6');		//4번재 문자 뒤의 문자를 6으로 변경
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");		//6번째 문자 뒤부터 13번째 문자까지를 "Book"으로 대치
		System.out.println(sb.toString());
		
		sb.delete(4, 5);		//5번째 문자를 삭제
		System.out.println(sb.toString());
		
		int length = sb.length();		//총 문자 수 얻기
		System.out.println("총 문자수 : " + length);
		
		String result = sb.toString();		//버퍼에 있는 것을 String 타입으로 리턴
		System.out.println(result);
	}
}
