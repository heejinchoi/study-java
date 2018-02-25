package exercise;

public class DiceSum {
	
	public static void main(String[] args) {
		// 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2)형태로 출력하고, 
		//눈의 합이 5가 아니면 계속 주사위를 던지고,
		//눈의 합이 5이면 실행을 멈추는 코드를 작성
		
		
		int sum=0;
		
		while(sum != 5) {
			int firstDice = (int)(Math.random()*6)+1;
			int secondDice = (int)(Math.random()*6)+1;
			sum = firstDice + secondDice;
			System.out.println("(" + firstDice + "," + secondDice + ")");
		}
		System.out.println("눈의 합이 5가 나왔습니다. 프로그램을 종료합니다.");
		System.exit(0);
	}

}
