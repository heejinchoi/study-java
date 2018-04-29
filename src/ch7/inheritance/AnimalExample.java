package ch7.inheritance;

public class AnimalExample {
	public static void main(String[] args) {
		
		//방법1: 가장 일반적인 방법 - 변수로 호출
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("---------------");
		
		//방법2: Animal 변수로 타입 변환해서 sound()메소드를 호출
		Animal animal = null;
		
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("---------------");
		
		//방법3: 부모 타입의 매개 변수에 자식 객체를 대입해서 다형성을 적용
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
