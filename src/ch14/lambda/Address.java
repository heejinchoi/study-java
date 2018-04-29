package ch14.lambda;

public class Address {
	private String country;
	private String city;
	
	public Address(String county, String city) {
		this.country = county;
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}
	
}
