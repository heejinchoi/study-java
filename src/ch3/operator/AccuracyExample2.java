package ch3.operator;

public class AccuracyExample2 {
	
	/* 정확하게 계산할 때는 부동소수점을 사용하지 않는다. */

	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10;
		int num = 7;
		int temp = totalPieces - num;
		double result = temp / 10.0;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면,");
		System.out.println(result + " 조각이 남는다.");
	}
}
