package ch16.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListCollectors {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("홍길동", 10),
			new Student("홍길동2", 20),
			new Student("홍길동3", 10),
			new Student("홍길동4", 20),
			new Student("홍길동5", 10),
			new Student("홍길동6", 20)
		);
		
		//10점인 학생들만 묶어 List 생성
		List<Student> score10List = totalList.stream()
									.filter(s -> s.getScore() == 10)
									.collect(Collectors.toList());
		System.out.println("10점인 학생: " +  score10List);
		score10List.stream().forEach(s -> System.out.println(s.getName()));
		
		//20점인 학생들만 묶어 List 생성
		Set<Student> score20List = totalList.stream()
									.filter(s -> s.getScore() == 20)
									.collect(Collectors.toCollection(HashSet::new));
		System.out.println("20점인 학생: " + score20List);
		
		score20List.stream().forEach(s -> System.out.println(s.getName()));
	}

}
