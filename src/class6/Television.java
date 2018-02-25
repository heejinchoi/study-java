package class6;

//정적 초기화 블록 - static
public class Television {
	static String company = "Samsyng";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
