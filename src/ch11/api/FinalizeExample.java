package ch11.api;

public class FinalizeExample {
	public static void main(String[] args) {
		Finalize finalize = null;
		
		for(int i=1; i<=50; i++) {
			finalize = new Finalize(i);
		}
		
		finalize = null;
		System.gc(); //=>쓰레기 수집기 실행 요청
	}
	
}
