package exercise;

import java.util.Scanner;

public class ArrayScanner {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		double[] scores = null;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------");
			System.out.print(" 선택> ");
			
			int selectNo = scan.nextInt();
			
			if(selectNo == 1) {
				System.out.print(" 학생수> ");
				studentNum= scan.nextInt();
				scores = new double[studentNum];
				
			}
			else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print(" scores["+i+"]의 점수입력> ");
					scores[i] = scan.nextInt();
					
					System.out.print(" scores["+i+"]> ");
					System.out.println(" 입력한 점수는 " + scores[i] + "점 입니다.");
					
					
				}
			}
			else if(selectNo == 3) {
				System.out.println(" 학생 " +studentNum+ "명의 점수 입니다.");
				for(int i=0; i<studentNum; i++) {
					System.out.println(" scores["+ i + "] 의 점수: " + scores[i]);
				}
			}
			else if(selectNo == 4) {
				int max = 0;
				double avg = 0;
				double sum = 0;

				for(int i=0; i<scores.length; i++) {
					sum += scores[i]; 
							
					if(max < scores[i]) {
						max += scores[i];
					}
					
					avg = sum/studentNum;

				}
				
				System.out.println("최고 점수 : "+ max);
				System.out.println("평균 점수: " + avg);
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
