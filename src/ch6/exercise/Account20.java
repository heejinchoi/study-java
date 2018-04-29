package ch6.exercise;
//계좌 생성, 목록 조회, 예금, 출금
public class Account20 {
	//필드
	private String account;
	private String owner;
	private int balance;
	
	//생성자
	public Account20(String account, String owner, int balance) {
		this.account = account;
		this.owner = owner;
		this.balance = balance;
	}

	//getter & setter
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
