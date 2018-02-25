package class6;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//'...'으로 선언된 매개 변수는 배열 타입 
	int sum2(int ... values) {
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
