package ch12.multithread;

public class User2 extends Thread{
	
	private Calculator_modify calculator_modify;
	
	public void setCalculator(Calculator_modify calculator_modify) {
		this.setName("User2");
		this.calculator_modify = calculator_modify;
	}
	
	public void run() {
		calculator_modify.setMemory(50);
	}

}
