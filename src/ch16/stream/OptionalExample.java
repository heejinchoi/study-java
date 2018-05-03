package ch16.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(3, 4, 5, 6, 7, 8, 9));
		
		
		//리스트에 값을 세팅하지 않아서 예외가 발생함
		//double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		
		//방법1) isPresnt()
		OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();
		if(optional.isPresent()) {
			optional.getAsDouble();
			System.out.println("방법1) 평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1) 평균: " + 0.0);
		}
		
		//방법2) orElse()
		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("방법2) 평균: " + avg);
		
		//방법3) ifPresent()
		list.stream().mapToInt(Integer::intValue).average()
						  .ifPresent(a -> System.out.println("방법3) 평균: " + a));
	}
}
