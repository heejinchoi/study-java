package ch11.api;

import java.util.Arrays;

public class DeepClone implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public DeepClone(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 복사를 해서 name, age를 복제한다.
		DeepClone cloned = (DeepClone) super.clone();
		
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		
		//car를 깊은 복제 한다.
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}
	
	public DeepClone getDeepClone() {
		DeepClone cloned = null;
		
		try {
			cloned = (DeepClone) clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	
	
}
