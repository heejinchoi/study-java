package ch11.api2;

public class ReceiveAction implements Action{

	@Override
	public void execute() {
		System.out.println("데이터를 받습니다.");
	}
	
}