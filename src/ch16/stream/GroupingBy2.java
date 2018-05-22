package ch16.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingBy2 {
	public static void main(String[] args) {
		
		//1-1. 전체 학생 List 에서 Stream을 얻는다.
		//1-2. Student를 Student.City로 매핑하는 Function을 얻는다.
		
		//2. Student 이름을 List에 수집하는 Collector를 얻는다.
		//2-1. Student 이름으로 매핑하는 Function을 얻는다. 
		//2-2. 이름을 List에 수집하는 Collector를 얻는다. 
		//2-3. Collectors의 mapping()메소드로 Student를 이름으로 매핑하고 이름을 List를 수집하는 Collector를 얻는다. 
		
		//3-1. Student.City가 키이고, 그룹핑된 이름 List가 값인 Map을 생성하는 Collector를 얻는다.
		//3-2. Stream의 collect() 메소드로 Student를 Student.City별로 그룹핑해서 Map을 얻는다.
		
		
		List<Student> totalList = Arrays.asList(
			new Student("홍길동", 10, Student.Sex.FEMALE, Student.City.Seoul),
			new Student("김수애", 20, Student.Sex.FEMALE, Student.City.Pusan),
			new Student("신용권", 6, Student.Sex.MALE, Student.City.Pusan),
			new Student("박수미", 50, Student.Sex.MALE, Student.City.Seoul)
		);
		
		Map<Student.City, List<String>> mapByCity = totalList.stream()
				.collect(Collectors.groupingBy(Student::getCity, 
												Collectors.mapping(Student::getName, Collectors.toList())));
		
		System.out.print("[서울 출신 학생]" + " ");
		mapByCity.get(Student.City.Seoul).stream().forEach(s -> System.out.print(s + "  "));
		System.out.print("\n[부산 출신 학생]" + " ");
		mapByCity.get(Student.City.Pusan).stream().forEach(s -> System.out.print(s + "  "));
	}
}
