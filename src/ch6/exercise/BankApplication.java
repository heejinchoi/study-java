package ch6.exercise;

import java.security.acl.Owner;
import java.util.Scanner;

public class BankApplication {
	//계좌를 저장할 수 있는 저장소를 만들어야 함.
	private static Account20[] accountArray = new Account20[100];
	
	//사용자에게 입력 받는 키보드 내용을 저장하도록.
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scan.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}
			else if(selectNo == 2) {
				accountList();
			}
			else if(selectNo == 3) {
				deposit();
			}
			else if(selectNo == 4) {
				withdraw();
			}
			else {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}
		}
	}
	
	//계좌 생성하기
	private static void createAccount() {
		System.out.println("====================");
		System.out.println("계좌 생성");
		System.out.println("====================");
		System.out.print("계좌 번호: ");
		String account = scan.next();
		System.out.print("계좌 주: ");
		String owner = scan.next();
		System.out.print("초기 입금액: ");
		int balance = scan.nextInt();
		
		Account20 newAccount = new Account20(account, owner, balance);
		
		//null이 발생하면 그곳부터 채우도록
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌 목록 조회
	private static void accountList() {
		System.out.println("====================");
		System.out.println("계좌 목록");
		System.out.println("====================");
		
		for(int i=0; i<accountArray.length; i++) {
			Account20 account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAccount());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.print(account.getBalance());
				System.out.print("\t");
				System.out.println();
			}
		}
		
	}
	
	//계좌번호를 찾아서 예금, 출금을 실행
	private static Account20 findAccount(String account) {
		Account20 accountList = null;
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAccount = accountArray[i].getAccount();
				
				if(dbAccount.equals(account)) {
					accountList = accountArray[i];
					break;
				}
			}
		}
		
		return accountList;
	}
	
	//에금
	private static void deposit() {
		System.out.println("====================");
		System.out.println("예금");
		System.out.println("====================");
		System.out.print("계좌번호: ");
		String account = scan.next();
		System.out.print("예금액: ");
		int money = scan.nextInt();
		
		Account20 accountList = findAccount(account);
		
		//계좌번호를 찾지 못한 경우(없는 경우)
		if(accountList == null) {
			System.out.println("찾으시는 계좌가 없습니다.");
			return;
		}
		accountList.setBalance(accountList.getBalance() + money);
		System.out.println("입금이 성공되었습니다. -> 결과: " + accountList.getBalance() + "원");
	}
	

	//출금
	private static void withdraw() {
		System.out.println("====================");
		System.out.println("출금");
		System.out.println("====================");
		System.out.print("계좌번호: ");
		String account = scan.next();
		System.out.print("출금액: ");
		int money = scan.nextInt();
		
		Account20 accountList = findAccount(account);
		
		//계좌번호를 찾지 못한 경우(없는 경우)
		if(accountList == null) {
			System.out.println("찾으시는 계좌가 없습니다.");
			return;
		}
		accountList.setBalance(accountList.getBalance() - money);
		System.out.println("출금이 성공되었습니다. -> 결과: " + accountList.getBalance() + "원");

		
	}
	
}
