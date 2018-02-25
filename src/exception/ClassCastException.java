package exception;

public class ClassCastException {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDag(dog);
		
		Cat cat = new Cat();
		changeDag(cat);
	}

	private static void changeDag(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal; 	//ClassCastException 발생
		}
	}
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}