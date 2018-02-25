package operator;

public class StringEqualsExample {
	
	/* 문자열의 값이 같은지 비교할 때는 '=='이 아니라 .equals()를 사용한다. */
	
	public static void main(String[] args) {
		String strVal1 = "최희진";
		String strVal2 = "최희진"; 	//자바는 문자열 리터럴이 동일하다면 동일한 String 객체를 참조하도록 되어 있다.
		
		String strVal3 = new String("최희진"); 	//참조되는 주소가 다르게 지정된다.
		
		System.out.println(strVal1 == strVal2);
		System.out.println(strVal1 == strVal3);
		System.out.println("-----------eauals-----------");
		System.out.println(strVal1.equals(strVal2));
		System.out.println(strVal1.equals(strVal3));
		
	
	}

}
