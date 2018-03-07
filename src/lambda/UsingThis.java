package lambda;

public class UsingThis {
	public int outterField = 10;
	
	class Inner{
		int innerField = 20;
		 
		void method() {
			//람다식
			MyFunctionalInterface4 fi = () -> {
				System.out.println("outterFiled: " + outterField);
				System.out.println("innerFiled: " + UsingThis.this.outterField + "\n");
				// └─ 바깥 객체의 참조를 얻기 위해서는 클래스명.this를 사용
				
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField + "\n");
			};
			fi.method();
		}
	}
}
