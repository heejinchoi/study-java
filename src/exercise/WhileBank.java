package exercise;

import java.util.Scanner;

public class WhileBank {
	
	public static void main(String[] args) {
		//은행 예금,출금,조회,종료 기능
		
		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		int inputMoney = 0;
		int outputMoney = 0;
		int balance = 0;
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("--------------------------");
			System.out.print(" 번호를 선택하세요 > ");
			
			int num = scanner.nextInt();
			
			
			switch(num) {
				case 1:
					System.out.print(" 예금액> ");
					inputMoney += scanner.nextInt();
					balance = inputMoney;
					System.out.println(" 입금 되었습니다.");
					break;
				case 2:
					System.out.print(" 출금액> ");					
					if(inputMoney < outputMoney) {
						System.out.println(" 출금액이 예금액 보다 많습니다. 잔고를 확인하세요.");
					}else {
						outputMoney = inputMoney - scanner.nextInt();
						balance = outputMoney;
						System.out.println("출금 되었습니다.");
					}
					break;
				case 3:
					System.out.print(" 잔고> ");
					System.out.print(" 입금액: " + inputMoney + "     ");
					System.out.print(" 출금액: " + outputMoney + "     ");
					System.out.print(" 잔액: "+  balance);
					System.out.println();
					break;
				default:
					System.out.println();
					run = false;
					break;
			}
			
		}
		
		System.out.println(" 프로그램을 종료합니다.");
	}

}
