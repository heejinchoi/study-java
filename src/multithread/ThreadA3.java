package multithread;

public class ThreadA3 extends Thread {
	private WorkObject workObject;
	
	public ThreadA3(WorkObject woObject) {	//공유 객체를 매개값으로 받아 필드에 저장
		this.workObject = woObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {	//공유객체의 methodA()를 10번 반복 호출
			workObject.methodA();	
		}
	}
}
