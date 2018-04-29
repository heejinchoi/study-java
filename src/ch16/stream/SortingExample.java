package ch16.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	public static void main(String[] args) {
		//숫자 요소일 경우 오름차순으로 정렬
		IntStream intStream = Arrays.stream(new int[] {5, 4, 3, 2, 1});
		intStream.sorted().forEach(n -> System.out.println(n + "\t"));
		System.out.println("------------------------");
		
		//Student 요소일 경우 Student의 기본 비교(Comparable) 방법을 이용해서 점수를 기준으로 오름차순으로 정렬
		//그리고 Comparator를 제공해서 점수를 기준으로 내림차순으로 정렬
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 30),
			new Student("신용권", 10),
			new Student("최희진", 20)
		);
		
		studentList.stream().sorted().forEach(s -> System.out.println(s.getScore() + "\t"));
		
		System.out.println("-------------------------");
		
		studentList.stream().sorted(Comparator.reverseOrder())
							.forEach(s -> System.out.println(s.getScore() + "\t"));
	}
}
