package generic;

public class BoundedTypeParmExample {
	public static void main(String[] args) {
		//String str = Util3.compare("a", "b");  =>오류. Number타입과 맞지 않음
		
		int result1 = Util3.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util3.compare(4.5, 3);
		System.out.println(result2);
	}
}
