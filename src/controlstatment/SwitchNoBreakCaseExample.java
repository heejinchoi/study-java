package controlstatment;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8;
		System.out.println("[현재시간: "+ time + "시]");
		
		//break가 없으면 연달아 실행된다.
		switch(time){
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의 합니다.");
			case 10:
				System.out.println("업무 봅니다.");
			default:
				System.out.println("외근 갑니다.");
		}
	} 
}
