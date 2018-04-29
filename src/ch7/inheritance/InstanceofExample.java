package ch7.inheritance;

public class InstanceofExample {
	
	public static void method1(ParentCasting parentCasting) {
		if(parentCasting instanceof ChildCasting) {
			ChildCasting childCasting = (ChildCasting) parentCasting;
			System.out.println("method1 - ChildCasting으로 변환 성공");
		}
		else {
			System.out.println("method1 - ChildCasting으로 변환되지 않음");
		}
	}

	
	public static void method2(ParentCasting parentCasting) {
		ChildCasting childCasting = (ChildCasting) parentCasting;
		System.out.println("method2 - ChildCasting으로 변환 성공"); 	//=>ClassCastException이 발생할 수 있음
	}
	
	
	public static void main(String[] args) {
		ParentCasting parentCasingA = new ChildCasting();
		method1(parentCasingA);
		method2(parentCasingA);
	
		
		ParentCasting parentCastingB = new ParentCasting();
		method1(parentCastingB);
		method2(parentCastingB); 	//=>예외 발생
	}
	
	
}
