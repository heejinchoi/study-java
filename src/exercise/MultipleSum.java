package exercise;

public class MultipleSum {
	
	public static void main(String[] args) {
		// 1~100까지의 정수 중에서 3의 배수의 총합을 구하는 코드
		int sum = 0;
		
		for(int i=0; i<=100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100까지 3의 배수의 합: "+sum);
		
	}

}
