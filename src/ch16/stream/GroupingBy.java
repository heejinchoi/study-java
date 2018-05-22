package ch16.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ch16.stream.Student.Sex;

public class GroupingBy {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("황미나", 50, Sex.FEMALE),
				new Student("김수정", 90, Sex.FEMALE),
				new Student("박수현", 70, Sex.FEMALE),
				new Student("홍길동", 60, Sex.MALE)
				);
		
		//1. 전체 학생 List에서 Stream을 얻는다. 
		Stream<Student> totalStream  = studentList.stream();
		
		//2. Student를 Student.Sex로 매핑하는 Function을 얻는다.
		Function<Student, Student.Sex> classifier = Student :: getSex;
		
		//3. Student.Sex가 키가 되고, 그룹핑된 List<Student>가 값인 Map을 생성하는 Collector를 얻는다.
		Collector<Student, ?, Map<Student.Sex, List<Student>>> collector = Collectors.groupingBy(classifier);
		
		//4. Stream의 collect() 메소드로 Student를 Student.Sex별로 그룹핑해서 Map을 얻는다.
		Map<Student.Sex, List<Student>> mapBySex = totalStream.collect(collector);
		
		System.out.println(mapBySex);
	}

}
