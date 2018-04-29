package ch6.class6;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myComputer = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myComputer.sum1(values1);
		System.out.println("result1: " + result1);
		
		int result2 = myComputer.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2: " + result2);
		
		int result3 = myComputer.sum2(1, 2, 3);
		System.out.println("result3: " + result3);
		
		int result4 = myComputer.sum2(1,2,3,4,5);
		System.out.println("result2: " + result2);
	}
}
