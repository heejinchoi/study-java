package ch7.inheritance;

public class ChildCastingExample {
	public static void main(String[] args) {
		ParentCasting parentCasting = new ChildCasting(); 	//=> 자동 타입 변환
		
		parentCasting.field1 = "data2";
		parentCasting.method1();
		parentCasting.method2();
		
		/*
		parentCasting.field2 = "data2"; 	=>불가능
		parentCasting.method3();
		*/
		
		ChildCasting childCasting = (ChildCasting) parentCasting; 	//=> 강제 타입 변환
		childCasting.field2 = "yyy";
		childCasting.method3();
		
		
	}
}
