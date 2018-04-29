package ch14.lambda;

public class Member2 {
	private String name;
	private String id;
	
	public Member2() {
		System.out.println("Member2() 실행");
	}
	
	public Member2(String id) {
		System.out.println("Member2(Sting id) 실행");
		this.id = id;
	}
	public Member2(String name, String id) {
		System.out.println("Member2(String name, String id) 실행");
		this.name = name;
		this.id = id;
	}

}
