package ch4.conditionalAndloopstatement;

import java.util.Scanner;

public class DoWhileExample {
	
	/* do-while문
	 * while문은 시작 할 때부터 조건식을 검사하여 블록 내부를 실행할지 결정하지만, 
	 * 경우에 따라서는 블록 내부의 실행문을 우선 실행시키고 실행 결과에 따라서 반복 실행을 계속할지 결정하는 경우도 발생한다.
	 * 
	 * 작성시 주의할 점은 while() 뒤에 반드시 세미콜론(;)을 붙여야 한다.
	 * 
	 *  Scanner
	 *  Scanner scan = new Sacnner(System.in);
	 *  String input = scan.nextLine();
	 * */
	
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
		}
		while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}

}
