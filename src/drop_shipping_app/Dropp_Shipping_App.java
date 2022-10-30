package drop_shipping_app;

import file_operations.File_class;
import operations_and_classes.Sales;
import operations_and_classes.SalesQuery;
public class Dropp_Shipping_App {

	public Dropp_Shipping_App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File_class start = new File_class();
		SalesQuery query_ = new SalesQuery();


		/*start.start("data/S1_Products.csv",1);*/
		/*start.start("data/S1_Products.csv",1);*/
		start.start_5();
		start.start_3();

		
		
		
		
		/*for( int i = 0; i < start.getNumberOfClass();i++) {
			System.out.println(start.productsArrayGetterMethod()[i].profitGetter()); */
			
		
		
		System.out.println(SalesQuery.mostProfitableProduct(start.productsArrayGetterMethod()).productNameGetter() + "-------" +SalesQuery.mostProfitableProduct(start.productsArrayGetterMethod()).profitGetter()+"tl"); //soru1
		
		System.out.println(SalesQuery.mostExpensiveProduct(start.productsArrayGetterMethod()).productNameGetter() + "-------" +SalesQuery.mostExpensiveProduct(start.productsArrayGetterMethod()).profitGetter()+ " tl"); //soru2
		
		
		System.out.println(query_.mostFrequentCustomer().customerNameGetter()+"---"+ query_.numberOfProductsOfMostBuyerFnc());

		System.out.println(query_.totalProfitCalculator()+" tl"); //soru4
		System.out.println(SalesQuery.leastProfitProductOfS1(start.salesArrayGetter()).profitGetter() +" tl"); // soru 5

		

		
		

	}

}
