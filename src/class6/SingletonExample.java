package class6;

public class SingletonExample {
	public static void main(String[] args) {

		//Singleton obj1 = new Singleton(); 	=>컴파일 에러: 싱글톤은 외부에서 객체 생성이 안된다.
		//Singleton obj2 = new Singleton(); 	
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
