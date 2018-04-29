package ch12.multithread;

public class ThreadB3 extends Thread{
	private WorkObject workObject;
	
	public ThreadB3(WorkObject workObject) {	//공유 객체를 매개값으로 받아 필드에 저장
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {	//공유 객체의 methodB()를 10번 반복 호출
			workObject.methodB();
		}
	}
}
