package multithread;

public class StartPrintThread extends Thread {

	private Thread targetThread;
	
	public StartPrintThread(Thread targetThread) {	//상태를 조사할 스레드
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			
			System.out.println("타켓 스레드 상태: " + state);

			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				//0.5초간 정지
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
		
		
	}
}
