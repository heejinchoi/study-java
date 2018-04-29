package ch4.conditionalAndloopstatement;

public class ForSumFrom1To100Example {
	
	/* 카운터 변수
	 * for(int i=1; i<=100; i++) 부분에서 int i = 0; 으로 for문 밖에서 미리 초기화 해 주는 것
	 * 그러면 for(i=1; i<=100; i++)가 된다.*/
	
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100의 합: "+sum);
	}
}
