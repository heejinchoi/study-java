package operator;

public class InputDataCheckNaNExample {
	
	/* 부동소수점(실수)을 입력받을 때는 반드시 NaN 검사를 해야 한다.
	 * valueOf() */

	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		System.out.println(val);
		
		double currentBalance1 = 10000.0;
		
		currentBalance1 += val;
		System.out.println("currentBalance1의 값: "+currentBalance1);
		
		System.out.println("------------------------------");
		
		double currentBalance2 = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		currentBalance2 += val;
		System.out.println("currentBalance2의 값: "+currentBalance2);
	}
}
