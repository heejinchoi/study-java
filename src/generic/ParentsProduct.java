package generic;

public class ParentsProduct<T, M> {
	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}
	public M getModel() {
		return this.model;
	}
	
	public void setKind(T Kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}

class Tv {
	
}
