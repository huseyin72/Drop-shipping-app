package operations_and_classes;

public class Sales {
	String id;
	String customer;
	String product;
	String salesDate;


	public Sales(String id, String customer, String product, String salesDate) {
		this.id = id;
		this.customer = customer;
		this.product = product;
		this.salesDate = salesDate;

	

		// TODO Auto-generated constructor stub
	}
	public String salesDateGetter() {
		return salesDate;
	}
	public String productIdGetter() {
		return product;
		
	}
	public String customerIdGetter() {
		return customer;
	}

}
