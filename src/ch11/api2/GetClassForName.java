package ch11.api2;

public class GetClassForName {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage());
		System.out.println();

		try {
			Class clazz2 = Class.forName("api2.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage());
			System.out.println();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
class Car{
	
}
