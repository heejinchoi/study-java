package ch16.stream;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "최희진", "신용권", "김자바", "스트림", "최희진");
		
		names.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println("---------------------");
		
		names.stream().filter(n -> n.startsWith("최")).forEach(n -> System.out.println(n));
		System.out.println("---------------------");
		
		names.stream().distinct().filter(n -> n.startsWith("최")).forEach(n -> System.out.println(n));
		
	}

}
