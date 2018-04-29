package ch4.conditionalAndloopstatement;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				continue; 	//=> continue를 통해 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어간다.
			}
			System.out.println(i);
		}
	}
}
