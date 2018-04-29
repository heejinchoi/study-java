package ch16.stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		/*List에서 학생의 점수를 요소로 하는 새로운 스트림을 생성하고, 점수를 순차적으로 콘솔에 출력*/
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 10),
			new Student("최희진", 20),
			new Student("신용권", 30)
		);
		
		studentList.stream().mapToInt(Student :: getScore).forEach(score -> System.out.println(score));
		
	}
}
