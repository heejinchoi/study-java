package variable;
public class LongExample {
	
	/*long 타입에서는 int 타입 변수의 범위보다 커지면 마지막에 L을 붙여줘야 한다.*/

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; 	=>컴파일 에러
		long var4 = 100000000000L;
		
		System.out.println("var1="+var1);
		System.out.println("var2="+var2);
		System.out.println("var4="+var4);
		
		
	}
}
