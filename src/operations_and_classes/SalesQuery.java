package operations_and_classes;
import file_operations.File_class;

public class SalesQuery {
	File_class file = new File_class();
	Product[] allSalesArray = new  Product[60];
	int counter = 0;
	int numberOfProductsOfMostBuyer = 0;
	
	public SalesQuery() {
		// TODO Auto-generated constructor stub
	}
	
	// getting most profitable product 
	public static Product mostProfitableProduct(Product[] productList ) {
		double mostProfitableProductVariable = 0;
		Product resultProduct = null;
		for (int i=0; i<productList.length; ++i) {
			if(mostProfitableProductVariable < productList[i].profitGetter() ) {
				mostProfitableProductVariable = productList[i].profitGetter();
				resultProduct = productList[i];
			}
			
		}
		
		return resultProduct ;
	}
	
	
	
	
	public static Product mostExpensiveProduct(Product[] productList ) {
		double mostExpesiveProductVariable = 0;
		Product resultProduct = null;
		for (int i=0; i<productList.length; ++i) {
			
			if(mostExpesiveProductVariable < productList[i].salesPriceGetter())  {
				mostExpesiveProductVariable = productList[i].salesPriceGetter();
				resultProduct = productList[i];
			}
			
		}
		
		return resultProduct ;
	}
	
	
	
	
	
	
	
	
	//total profit calculator method

	
	
	
	public static Product leastProfitProductOfS1(Product[][] productList) {
		double leastProfitableProductVariable = 10000000;
		Product[] loopProduct = productList[0];
		Product resultProduct = null;
		for(int i = 0;i<20;++i) {
			if(leastProfitableProductVariable > productList[0][i].profitGetter()) {
				leastProfitableProductVariable = productList[0][i].profitGetter();
				
				resultProduct = productList[0][i];
				
			}
		}
		return resultProduct ;
		
		
	}
	
	
	
	public  int totalProfitCalculator() {
		
		file.start_5();
		file.start_4();
		file.start_3();
		int totalProfit = 0;
			for(int products = 0 ;products < file.productsArrayGetterMethod().length; ++products) {
				for (int sales = 0; sales < file.salesArray().length; ++sales) {
					if (file.salesArray()[sales].productIdGetter().equals(file.productsArrayGetterMethod()[products].idGetter())){
						allSalesArray[counter] = file.productsArrayGetterMethod()[products];
						++counter;
						
					}
				}
				
			}
			
		
		for(int i = 0;i < counter; ++i) {
			totalProfit += allSalesArray[i].profitGetter();
			
			
		}
		return totalProfit;
 
	}
	
	public  String mostFrequent(Sales[] arr, int n)
	  {
		file.start_2();
		file.start_3();
	    int maxcount = 0;
	    String element_having_max_freq="";
	    for (int i = 0; i < n; i++) {
	      int count = 0;
	      for (int j = 0; j < n; j++) {
	        if (arr[i].customerIdGetter() == arr[j].customerIdGetter()) {
	          count++;
	        }
	      }
	 
	      if (count > maxcount) {
	        maxcount = count;
	        element_having_max_freq = arr[i].customerIdGetter();
	      }
	    }
	 
	    return element_having_max_freq;
	  }
	
	public Customer mostFrequentCustomer() {
		file.start_2();
		Customer result = file.customerArray()[0];
		for(int i = 0; i < file.customerArray().length; ++i) {
			if (file.customerArray()[i].customerIdGetter().equals( mostFrequent(file.salesArray(),20))){
				result = file.customerArray()[i];
				
				
			}
			
			
		}
		
		for(int i = 0; i < file.salesArray().length; ++i) {
			if (file.salesArray()[i].customerIdGetter().equals( mostFrequent(file.salesArray(),20))){

				++numberOfProductsOfMostBuyer;
				
				
				
				
				
				
			}
		}
		return result;
	}
	public int numberOfProductsOfMostBuyerFnc() {
		return numberOfProductsOfMostBuyer;
	}
	
	
	 


}
