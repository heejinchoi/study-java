package multithread;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA3의 methodA() 작업 실행");
		notify();	//일시 정지 상태에 있는 ThreadB3를 실행 대기 상태로 만듦
		
		try {
			wait();	//ThreadA3를 일시 정시 상태로 만듦
		}catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB3의 methodB() 작업 실행");
		notify();	//일시 정지 상태에 있는 ThreadA3를 실행 대기 상태로 만듦
		
		try {
			wait();	//ThreadB3를 일시 정지 상태로 만듦
		}catch(InterruptedException e) {
		}
	}
}
