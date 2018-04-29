package ch7.inheritance;

public class TireCarExample {
	public static void main(String[] args) {
		TireCar tireCar = new TireCar();
		
		for(int i=0; i<=5; i++) {
			int problemLocation = tireCar.run();

			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 HankookTire로 교체");
					tireCar.frontLeft = new HankookTire("앞왼족", 15);
					break;
				case 2:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					tireCar.frontRight = new KumhoTire("앞오른쪽", 13);
					break;
				case 3:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					tireCar.backLeft = new HankookTire("뒤왼쪽", 14);
					break;
				case 4:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					tireCar.backRight = new KumhoTire("뒤오른쪽", 17);					
					break;
			}
			System.out.println("-----------------------------------------");
		}
		
	}
}
