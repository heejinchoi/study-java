package ch11.api2;

public class SendAction implements Action {

	@Override
	public void execute() {
		System.out.println("데이터를 보냅니다.");
	}
	
}
