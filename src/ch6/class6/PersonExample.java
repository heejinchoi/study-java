package ch6.class6;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456789", "계백	");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa"; 	=>final 필드는 수정 불가
		//p1.ssn = "987654321"; 	=>final 필드는 수정 불가
		p1.name = "을지문덕";
		
	}

}
