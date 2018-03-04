package multithread;

public class ThreadBB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadBB 작업 내용");
			}
			else {
				ThreadBB.yield();
			}
		}
		System.out.println("ThreadBB 종료");
	}
}
