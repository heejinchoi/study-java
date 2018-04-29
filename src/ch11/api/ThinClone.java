package ch11.api;

public class ThinClone implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public ThinClone(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public ThinClone getClone() {
		ThinClone cloned = null;
		
		try {
			cloned = (ThinClone) clone();
		} catch(CloneNotSupportedException e) {
			
		}
		return cloned;
		
	}
}
	
	
