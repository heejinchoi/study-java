package interface8.exercise;

//익명 구현 객체
public class ActionEample {
	
	public static void main(String[] args) {
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}

		};
		action.work();
	}

}
