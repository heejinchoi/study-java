package ch3.operator;

public class CheckOverflowExample {

	public static void main(String[] args) {
		int result1 = safeAdd1(2000000000, 2000000000);
		
		System.out.println("----------------------------------");
		
		try {
			int result2 = safeAdd2(2000000000, 2000000000);
			System.out.println(result2);
			
		}catch(ArithmeticException e){
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
		
	}
	
	public static int safeAdd1(int left, int right){
		
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right)) {
				System.out.println("오버플로우 발생");
			}
		}
		else {
			if(left < (Integer.MIN_VALUE -right)) {
				System.out.println("오버플로우 발생");
			}
		}
		return left + right;
	}
	
	public static int safeAdd2(int left, int right) {
		
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}else {
			if(left < (Integer.MIN_VALUE -right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		
		return left + right;
	}
}
