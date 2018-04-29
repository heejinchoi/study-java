package ch16.stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		/*int[] 배열로부터 IntSteam을 얻고 난 다음 int 요소를 double 요소로 타입 변환해서 DoubleStream을 생성한다.*/
		int[] intArray = {1, 2, 3, 4, 5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream().forEach(d -> System.out.println(d));
		
		System.out.println("-------------------------------------");
		
		/*int 요소를 Integer 객체로 박싱해서 Stream<Integer>를 생성한다.*/
		intStream = Arrays.stream(intArray);
		intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));
	}

}
