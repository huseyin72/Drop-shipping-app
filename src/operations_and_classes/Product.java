package operations_and_classes;

public class Product {

	private String id;
	private String title;
	private double rate;
	private int numberOfViews ;
	private double price;
	

	public Product(String id ,String title, String rate, String numberOfViews, String price) {
		this.id = id;
		this.title = title;
		this.rate = Double.parseDouble(rate);
		this.numberOfViews = Integer.parseInt(numberOfViews);
		try{
			this.price = Double.parseDouble(price);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("error message...");
		}
		
		// TODO Auto-generated constructor stub

	}
	
	
	public String productNameGetter() {
		
		return title;
		
		
	}
	public double priceGetter() {
		return price;
	}
	
	public int profitGetter(){
		double salesPrice = price + ((rate/(5.0)*100)*numberOfViews);
		double profit = salesPrice - price;
		return (int)profit;
		
	}
	
	public int salesPriceGetter() {
		double salesPrice = price + ((rate/(5.0)*100)*numberOfViews);
		return (int)salesPrice;
		
	}
	
	
	public String idGetter() {
		return id;
	}
	

}
