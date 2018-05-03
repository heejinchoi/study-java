package ch16.stream;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
			new Student("최희진", 30),
			new Student("김은", 35),
			new Student("김은혜", 88),
			new Student("이수연", 47),
			new Student("김은정", 69)
		);
		
		int sum = students.stream().mapToInt(Student::getScore).sum();
		System.out.println("sum: " + sum);
		
		int sum2 = students.stream().map(Student::getScore).reduce((a,b) -> a+b).get();
		System.out.println("sum2: " + sum2);
		
		int sum3 = students.stream().map(Student::getScore).reduce(0,  (a,b) -> a+b);
		System.out.println("sum3: " + sum3);
				
				
	}
}
	