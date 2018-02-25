package controlstatment;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int i = 1; 	//카운터 변수
		int sum = 0;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(1+" 부터 "+(i-1)+" 까지의 합: "+sum);
	}

}
