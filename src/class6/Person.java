package class6;

//final 필드로 초기값 지정해 주기
public class Person {
	
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
