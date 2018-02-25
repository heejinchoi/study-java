package controlstatment;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		
		// 구구단 출력하기
		for(int m = 2; m<10; m++) {
			System.out.println(m+"단 입니다.");
			for(int n = 2; n <10; n++) {
				int sum = m * n;
				System.out.println(m + " x " + n + " = " + sum);
			}
		}
	}
}
