package operator;

public class ConditionalOperationExample {
	
	/* 조건 연산식
	 * (조건식) ? () : () */
	
	public static void main(String[] args) {
		int score = 85;
		char grade = ((score > 90) ? 'A' : (score > 80) ? 'B' :'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
	}

}
