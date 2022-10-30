package operations_and_classes;

public class Customer {
	String id;
	String name;
	String email;
	String country;
	String adress;

	public Customer(String id, String name, String email, String country, String adress) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.email = email;
		this.country = country;
		this.adress = adress;
		
	}
public String customerNameGetter() {
		
		return name;
		
		
	}
public String customerIdGetter() {
	return id;
}

}
