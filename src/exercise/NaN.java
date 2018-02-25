package exercise;

public class NaN {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if(Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}
		else {
			double result = z + 10;
			System.out.println(result);
		}
		
		float a = 5.0f;
		float b = 0.0f;
		
		float c = a / b;
		
		if(Float.isInfinite(c)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}
		else {
			float d = c + 10;
			System.out.println(d);
		}
	}
}
