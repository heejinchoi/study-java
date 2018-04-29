package ch16.stream;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동", Member.MALE, 30),
			new Member("김나리", Member.FEMALE, 20),
			new Member("신용권", Member.MALE, 45),
			new Member("최희진", Member.FEMALE, 26)
		);
		
		/*파이프 라인*/
		/*회원 컬렉션에서 남자만 필터링하는 중간 스트림을 연결하고, 다시 남자의 나이로 매핑하는 스트림을 연결한 후, 최종 남자 평균 나이를 집계하는 파이프라인*/
		double ageAvg = 
				list.stream().filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member :: getAge)
				.average().getAsDouble();
		
		System.out.println("남자 평균 나이: " + ageAvg);
				
	}

}
