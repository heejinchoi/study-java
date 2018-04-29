package ch6.exercise;

public class Account {
	//필드
	private int balance; 	//외부에서 값을 읽거나 변경할 수 없음.
	
	//상수
	public static final int MAX_BALANCE = 1000000; 	//상수는 초기 값을 주어야 한다.
	public static final int MIN_BALANCE = 0;
	

	public int getBalance() {
		return balance;
	}
	
	//유효성 검사(MIN < balance <MAX)
	public void setBalance(int balance) {
		if(balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		}
		this.balance = balance;
	}
	
	

}
