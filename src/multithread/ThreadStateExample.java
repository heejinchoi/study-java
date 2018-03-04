package multithread;

public class ThreadStateExample {
	public static void main(String[] args) {
		StartPrintThread startPrintThread = new StartPrintThread(new TargetThread());
		
		startPrintThread.start();
	}
}
