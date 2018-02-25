package exercise;

public class Trapezoid {
	public static void main(String[] args) {
		//사다리꼴 면적 구하기 - 정확히 소수자리가 나올 수 있도록
		int lengthTop = 5;
		int lengthBottom = 10;
		int hight = 7;
		
		double area = (lengthTop + lengthBottom) * hight;
		System.out.println(area);
		
	}	

}
