package operations_and_classes;

import file_operations.File_class;

public class Compiler {

	public Compiler() {
		// TODO Auto-generated constructor stub
	}

	public static void run() {
		File_class start = new File_class();
		SalesQuery query_ = new SalesQuery();
		// getting ready all file reading operations
		start.prepareFiles();
		System.out.println("The most profitable product among the three suppliers is "+SalesQuery.mostProfitableProduct(start.productsArrayGetterMethod()).productNameGetter() + "---> " +SalesQuery.mostProfitableProduct(start.productsArrayGetterMethod()).profitGetter()+" TL"); //q1
		System.out.println("The most expensive product in terms of Sales Price is "+SalesQuery.mostExpensiveProduct(start.productsArrayGetterMethod()).productNameGetter() + "---> " +SalesQuery.mostExpensiveProduct(start.productsArrayGetterMethod()).profitGetter()+ " TL"); //q2
		System.out.println("The customer who purchases the most products for all three suppliers is "+query_.mostFrequentCustomer().customerNameGetter()+"---> "+ query_.numberOfProductsOfMostBuyerFnc() +" purchases");//q3
		System.out.println("The total profit that is made from all sales is "+query_.totalProfitCalculator()+" TL"); //q4
		System.out.println("The least-profit product of S1 is "+SalesQuery.leastProfitProductOfS1(start.salesArrayGetter()).profitGetter() +" tl"); // q5
		Supplier supplier1= new Supplier(start.salesArrayGetter()[0]);
		Supplier supplier2= new Supplier(start.salesArrayGetter()[1]);
		Supplier supplier3= new Supplier(start.salesArrayGetter()[2]);
		SalesManagement allSales =  new SalesManagement();

	}
}
