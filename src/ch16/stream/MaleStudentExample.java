package ch16.stream;

import java.util.Arrays;
import java.util.List;

import ch16.stream.Student.Sex;

public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("황미나", 50, Sex.FEMALE),
			new Student("김수정", 90, Sex.FEMALE),
			new Student("박수현", 70, Sex.FEMALE),
			new Student("홍길동", 60, Sex.MALE)
		);
		
		MaleStudent maleStudent = totalList.stream().filter(s -> s.getSex() == Student.Sex.MALE).collect(MaleStudent :: new, MaleStudent :: accumulate, MaleStudent :: combine);
		
		maleStudent.getList().stream().forEach(s -> System.out.println(s.getName()));
		
		//실행 결과를 보면 처리를 담담하는 스레드는 main 스레드임을 알 수 있다.
		
	}
}
