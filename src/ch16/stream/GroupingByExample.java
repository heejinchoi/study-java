package ch16.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ch16.stream.Student.Sex;

public class GroupingByExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList (
			new Student("황미나", 50, Sex.FEMALE),
			new Student("김수정", 90, Sex.FEMALE),
			new Student("박수현", 70, Sex.FEMALE),
			new Student("홍길동", 60, Sex.MALE)
		);
		
		Map<Student.Sex, List<Student>> mapBySex = studentList.stream().collect(Collectors.groupingBy(Student :: getSex));
		
		System.out.println(mapBySex);
		
	}
}
