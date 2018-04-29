package ch16.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "신용권", "최희진");
		
		//Iterator 사용
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println("iterator: " + name);
		}

		System.out.println("-------------------");
		
		//Stream 사용
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println("stream: " + name));
	}

}
