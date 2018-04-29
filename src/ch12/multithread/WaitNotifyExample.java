package ch12.multithread;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();	//공유 객체 생성
		
		ThreadA3 threadA3 = new ThreadA3(sharedObject);
		ThreadB3 threadB3 = new ThreadB3(sharedObject);
		
		threadA3.start();
		threadB3.start();
		
	}
}
