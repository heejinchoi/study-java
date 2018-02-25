package variable;
public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; 	=> 컴파일 에러: 바이트 타입의 연산 결과는 int로 나온다.
		
		int intValue1= byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; 	=> 컴파일 에러: 캐릭터 타입의 연산 결과는 int 값으로 나온다.
		
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드: "+intValue2);
		System.out.println("출력문자: "+(char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; 	=> 컴파일 에러: 리터럴이 실수 타입으로 되어있으면 double 타입이어야 한다.
		double doubleValue = intValue5 /4.0;
		System.out.println(doubleValue);
	}
}
