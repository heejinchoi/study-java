package exercise;

public class ShapeForTriangle {
	public static void main(String[] args) {
		//삼각형 모양 * 출력하기
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
				if(i==j) {
					System.out.println();
				}
			}
		}
	}

}
