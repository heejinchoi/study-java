package ch12.multithread;

public class WorkThread extends Thread{
	
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);		//스레드 그룹과 스레드 이름 설정
	}
	
	@Override
	public void run() {
		while(true) {
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e) {		//interruptedExcption이 발생할 때 while문을 빠져나와 스레드를 종료시킴
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		
		System.out.println(getName() + " 종료됨");
	}
}
