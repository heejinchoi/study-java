package ch13.generic;

public class ChildProduct<T, M, C> extends ParentsProduct<T, M> {
	public C company;
	
	public C gtCompany() {
		return company;
	}
	
	public void setCompany(C company) {
		this.company = company;
	}

}
