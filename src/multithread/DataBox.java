package multithread;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();		//data 필드가 null 이면 ConsummerThread를 일시 정지 상태로 만듦
			}catch (InterruptedException e) {
			}
		}
		
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터 : " + returnValue);
		
		data = null;
		notify();		//data 필드를 null로 만들고 ProducerThread를 실행 대기 상태로 만듦
		
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();		//data 필드가 null이 아니면 ProducerThread를 일시 정지 상태로 만듦
			}catch (InterruptedException e) {
			}
		}

		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터 : " + data);
		notify();		//data 필드에 값을 저장하고 ConsummerThread를 실행 대기 상태로 만듦
	}
}
