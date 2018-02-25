package class6;

//다른 생성자를 호출해서 중복 코드 줄이기
public class Car4 {
	//필드
	String compony = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car4(){
		
	}
	
	Car4(String model){
		this(model, "은색", 250);
	}
	
	Car4(String model, String color){
		this(model, color, 250);
	}
	
	//공통 실행 코드
	Car4(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
