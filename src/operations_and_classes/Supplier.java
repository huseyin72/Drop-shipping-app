package operations_and_classes;

public class Supplier {
	private Product[] arrayHoldsProducts;
	

	public Supplier(Product[] productsArray ) {
		// TODO Auto-generated constructor stub
		arrayHoldsProducts = productsArray;
		
	}

	
	public Product[] productsArrayGetter() {
		return arrayHoldsProducts;
	}

}
