package class6;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		myCal.powerOn();
		
		int result1 = myCal.plus(5, 6);
		System.out.println("더하기: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCal.divide(x, y);
		System.out.println("나누기: " + result2);
		
		myCal.powerOff();
		
	}
}
