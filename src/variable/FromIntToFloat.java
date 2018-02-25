package variable;
public class FromIntToFloat {
 
	/* int 와 float 타입은 둘 다 4byte이지만, 실수형인 float 와 double 타입은 부호,지수,가수로 비트 수가 나눠져 있다.*/
	
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		
		System.out.println("int 변수값을 대입한 float 값 ---- num3= "+num3);
		System.out.println("float 변수값을 int로 캐스팅한 값 ----num2= "+num2);
		System.out.println("초기 int 값에서 float 타입에서 다시 int로 캐스팅한 값의 차 ---- "+result);
	}
}