package ch16.stream;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		System.out.println("[peek()를 마지막에 호출하면 안되고, 최종 처리 메소드를 호출해야 함]");
		int total = Arrays.stream(intArr).filter(a -> a%2==0).peek(n -> System.out.println(n)).sum();
		System.out.println("총합: " + total);
		
		System.out.println("[forEach()를 마지막에 호출한 경우]");
		Arrays.stream(intArr).filter(a -> a%2==0).forEach(n -> System.out.println(n));
		
	}
	

}
