package ch7.inheritance;

public class TireCarExample2 {
	public static void main(String[] args) {
		TireCar2 tireCar2 =  new TireCar2();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = tireCar2.run();
			if(problemLocation != 0) {
				System.out.println(tireCar2.tires[problemLocation-1].location + "HankookTire로 교체");
				tireCar2.tires[problemLocation-1] = new HankookTire(tireCar2.tires[problemLocation-1].location, 15);
			}
			
			System.out.println("-------------------------------------------");
		}
		
	}

}
