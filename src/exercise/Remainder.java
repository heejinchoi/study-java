package exercise;

public class Remainder {
	public static void main(String[] args) {
		//356의 값에서 십의 자리 이하를 버리는 코드. (300이 나올 수 있도록 해야 함) 
		int value = 326;
		System.out.println(value - value%100);
	}

}
