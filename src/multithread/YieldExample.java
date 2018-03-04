package multithread;

public class YieldExample {
	public static void main(String[] args) {
		ThreadAA threadAA = new ThreadAA();
		ThreadBB threadBB = new ThreadBB();
		
		threadAA.start();	//ThreadAA 실행
		threadBB.start();	//ThreadBB 실행
		
		try {Thread.sleep(3000);}catch(InterruptedException e) {e.printStackTrace();}
		threadAA.work = false;	//ThreadBB만 실행
		
		try {Thread.sleep(3000);}catch(InterruptedException e) {e.printStackTrace();}
		threadAA.work = true;	//ThreadAA, ThreadBB 모두 실행
		
		try {Thread.sleep(3000);}catch(InterruptedException e) {e.printStackTrace();}
		threadAA.stop = true;	//ThreadAA 종료
		threadBB.stop = true;	//ThreadBB 종료
		
	}
}
