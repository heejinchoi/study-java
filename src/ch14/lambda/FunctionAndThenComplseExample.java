package ch14.lambda;

import java.util.function.Function;

public class FunctionAndThenComplseExample {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		
		String city;
		
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(
			new Member("홍길동", "hong", new Address("한국", "서울"))
		);
		System.out.println("거주 도시: " + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
			new Member("홍길동2", "hong2", new Address("대한민국", "부산"))
		);
		System.out.println("거주 도시: " + city);
				
	}
}
