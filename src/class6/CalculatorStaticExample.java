package class6;

//정적 멤버 사용-static
public class CalculatorStaticExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * CalculatorStatic.pi;
		int result2 = CalculatorStatic.plus(10, 5);
		int result3 = CalculatorStatic.minus(10, 5);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}
}
