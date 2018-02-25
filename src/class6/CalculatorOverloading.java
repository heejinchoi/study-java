package class6;

//메소드 오버로딩-매개값의 수에 따라 JVM이 오버로딩 된 메소드 실행을 결정
public class CalculatorOverloading {
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
