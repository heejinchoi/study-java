package multithread;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Calculator_modify calculator_modify = new Calculator_modify();
		
		User1 user1 = new User1(); 	//User1 스레드 생성
		user1.setCalculator(calculator_modify); 	//공유객체 설정
		user1.start();

		User2 user2 = new User2(); 	//User2 스레드 생성
		user2.setCalculator(calculator_modify);	//공유객체 설정
		user2.start();
		
	}
}
