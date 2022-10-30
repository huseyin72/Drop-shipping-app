package file_operations;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import drop_shipping_app.*;
import operations_and_classes.Customer;
import operations_and_classes.Product;
import operations_and_classes.Sales;

public class File_class {

	public File_class() {
		// TODO Auto-generated constructor stub
	}

	
	private Scanner sc;
	private Scanner sc2;
	private Product[] productsHoldArray;
	private int counter = 0;
	private Product[][] twoDimensionalProducts = new  Product[3][30];
	private Sales[] salesHoldArray = new Sales[60];
	private Customer[] customersHoldArray = new Customer[20];
    
	
	
	
	
	
	
	public void start_5() {
		
		productsHoldArray = new  Product[getNumberOfClass()]; /*getNumberOfClass(path)*/
		
		/*s1*/
    	try
    	{	int counter_S1 = 0;
    		sc = new Scanner(new File("data/S1_Products.csv"));
    		sc.useDelimiter(",|\\n");
    		sc.next();
    		sc.next();
    		sc.next();
    		sc.next();
    	    sc.next();

    		
    		while(sc.hasNext()) {
    			
    			
    			/* for S1 */
    			
    			
    			String line1 = sc.next();
    			String line2 = sc.next();
    			String line3 =  sc.next();
    			String line4 =  sc.next();
    			String line5 = sc.next();
    			
    			Product exp;
				  exp = new Product(line1,line2,line3,line4,line5);
				  productsHoldArray[counter] = exp;
				  twoDimensionalProducts[0][counter_S1] =exp;
				  

				  ++counter;
				  ++counter_S1;
				  
    				
    				
    			}
    			 
    			
    		
    		sc.close();
    		
    	}
    	catch(IOException e)
    	{
    		System.out.println("file not found");
    	}
    	
    	
    	
    	/* s2*/
    	try
    	{	
    		int counter_S2 = 0;
    		sc = new Scanner(new File("data/S2_Products.csv"));
    		sc.useDelimiter(",|\\n");
    		sc.next();
    		sc.next();
    		sc.next();
    		sc.next();
    	    sc.next();

    		
    		while(sc.hasNext()) {
    			
    			
    			/* for S2 */
    			
    			
    			String line1 = sc.next();
    			String line2 = sc.next();
    			String line3 =  sc.next();
    			String line4 =  sc.next();
    			String line5 = sc.next();
    			
    			Product exp;
				  exp = new Product(line1,line2,line3,line4,line5);
				  productsHoldArray[counter] = exp;
				  twoDimensionalProducts[1][counter_S2] =exp;

				  ++counter;
				  ++counter_S2;
				  
    				
    				
    			}
    			 
    			
    		
    		sc.close();
    		
    	}
    	catch(IOException e)
    	{
    		System.out.println("file not found");
    	}


    	
    	
    	
    	
    	
    	try
    	{	int counter_S3 = 0;
    		sc = new Scanner(new File("data/S3_Products.csv"));
    		sc.useDelimiter(",|\\n");
    		sc.next();
    		sc.next();
    		sc.next();
    		sc.next();
    	    sc.next();

    		
    		while(sc.hasNext()) {
    			
    			
    			/* for S3 */
    			
    			
    			String line1 = sc.next();
    			String line2 = sc.next();
    			String line3 =  sc.next();
    			String line4 =  sc.next();
    			String line5 = sc.next();
    			
    			Product exp;
				  exp = new Product(line1,line2,line3,line4,line5);
				  productsHoldArray[counter] = exp;
				  twoDimensionalProducts[2][counter_S3] =exp;

				  ++counter;
				  ++counter_S3;
				  
				  
    				
    				
    			}
    			 
    			
    		
    		sc.close();
    		
    	}
    	catch(IOException e)
    	{
    		System.out.println("file not found");
    	}


    }
	
	
	
		
	
	
	
	
	public Product[] productsArrayGetterMethod() {
		Product[] productsArrayCopy = new  Product[getNumberOfClass()];
		for(int i = 0; i < productsHoldArray.length; ++i) {
			productsArrayCopy[i] = productsHoldArray[i];
		}
		
		
		return productsArrayCopy;

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public Product[][]  salesArrayGetter(){
		return twoDimensionalProducts ;
	}
	
	
	
	
	
	
	public int getNumberOfClass() {
		
		int number = 0;
		try {
			
			
			sc2 = new Scanner(new File("data/S1_Products.csv"));
			sc2.useDelimiter("\n");
			sc2.next();
			while(sc2.hasNext()) {
				sc2.next();
				++number;
			}
			
		}
		catch(IOException e)
		{
			System.out.println("file not found for get number");
		}
		
		try {
			
			
			sc2 = new Scanner(new File("data/S2_Products.csv"));
			sc2.useDelimiter("\n");
			sc2.next();
			while(sc2.hasNext()) {
				sc2.next();
				++number;
			}
			
		}
		catch(IOException e)
		{
			System.out.println("file not found for get number");
		}
		
		try {
			
			
			sc2 = new Scanner(new File("data/S3_Products.csv"));
			sc2.useDelimiter("\n");
			sc2.next();
			while(sc2.hasNext()) {
				sc2.next();
				++number;
			}
			
		}
		catch(IOException e)
		{
			System.out.println("file not found for get number");
		}
		
		return number ;
		
	}

	
	
	
	
	
	
		
	
	
	
	
	public void start_4() {
		

		    	try
    	{	int counter_S1 = 0;
    		sc = new Scanner(new File("data/S1_Products.csv"));
    		sc.useDelimiter(",|\\n");
    		sc.next();
    		sc.next();
    		sc.next();
    		sc.next();
    	    sc.next();

    		
    		while(sc.hasNext()) {
    			
    			
    			/* for S1 */
    			
    			
    			String line1 = sc.next();
    			String line2 = sc.next();
    			String line3 =  sc.next();
    			String line4 =  sc.next();
    			String line5 = sc.next();
    			
    			Product exp;
				  exp = new Product(line1,line2,line3,line4,line5);
				  twoDimensionalProducts[0][counter_S1] =exp;
				  

				  ++counter_S1;
				  
    				
    				
    			}
    			 
    			
    		
    		sc.close();
    		
    	}
    	catch(IOException e)
    	{
    		System.out.println("file not found");
    	}
    	
    	
    	
    	/* s2*/
    	try
    	{	
    		int counter_S2 = 0;
    		sc = new Scanner(new File("data/S2_Products.csv"));
    		sc.useDelimiter(",|\\n");
    		sc.next();
    		sc.next();
    		sc.next();
    		sc.next();
    	    sc.next();

    		
    		while(sc.hasNext()) {
    			
    			
    			/* for S2 */
    			
    			
    			String line1 = sc.next();
    			String line2 = sc.next();
    			String line3 =  sc.next();
    			String line4 =  sc.next();
    			String line5 = sc.next();
    			
    			Product exp;
				  exp = new Product(line1,line2,line3,line4,line5);
				  twoDimensionalProducts[1][counter_S2] =exp;
				  ++counter_S2;
				  
    				
    				
    			}
    			 
    			
    		
    		sc.close();
    		
    	}
    	catch(IOException e)
    	{
    		System.out.println("file not found");
    	}


    	
    	
    	
    	
    	
    	try
    	{	int counter_S3 = 0;
    		sc = new Scanner(new File("data/S3_Products.csv"));
    		sc.useDelimiter(",|\\n");
    		sc.next();
    		sc.next();
    		sc.next();
    		sc.next();
    	    sc.next();

    		
    		while(sc.hasNext()) {
    			
    			
    			/* for S3 */
    			
    			
    			String line1 = sc.next();
    			String line2 = sc.next();
    			String line3 =  sc.next();
    			String line4 =  sc.next();
    			String line5 = sc.next();
    			
    			Product exp;
				  exp = new Product(line1,line2,line3,line4,line5);
				  twoDimensionalProducts[2][counter_S3] =exp;

				  ++counter_S3;
				  
				  
    				
    				
    			}
    			 
    			
    		
    		sc.close();
    		
    	}
    	catch(IOException e)
    	{
    		System.out.println("file not found");
    	}


    }
	
	
	
	
	public void start_3() {
		int sales_counter = 0;

    	try
{	
	sc = new Scanner(new File("data/S1_Sales.csv"));
	sc.useDelimiter(",|\\n");
	sc.next();
	sc.next();
	sc.next();
	sc.next();


	
	while(sc.hasNext()) {
		
		
		/* for S1 */
		
		
		String line1 = sc.next();
		String line2 = sc.next();
		String line3 =  sc.next();
		String line4 =  sc.next();


		Sales sale = new Sales(line1,line2,line3,line4 );
		salesHoldArray[sales_counter] = sale;
		++sales_counter;
		  

		
		  
			
			
		}
		 
		
	
	sc.close();
	
}
catch(IOException e)
{
	System.out.println("file not found");
}



/* s2*/
    	try
{	
	sc = new Scanner(new File("data/S2_Sales.csv"));
	sc.useDelimiter(",|\\n");
	sc.next();
	sc.next();
	sc.next();
	sc.next();



	
	while(sc.hasNext()) {
		
		
		/* for S1 */
		
		
		String line1 = sc.next();
		String line2 = sc.next();
		String line3 =  sc.next();
		String line4 =  sc.next();


		Sales sale = new Sales(line1,line2,line3,line4);
		salesHoldArray[sales_counter] = sale;
		  
		  
		++sales_counter;
		
		  
			
			
		}
		 
		
	
	sc.close();
	
}
catch(IOException e)
{
	System.out.println("file not found");
}








    	try
{	
	sc = new Scanner(new File("data/S3_Sales.csv"));
	sc.useDelimiter(",|\\n");
	sc.next();
	sc.next();
	sc.next();
	sc.next();



	
	while(sc.hasNext()) {
		
		
		/* for S1 */
		
		
		String line1 = sc.next();
		String line2 = sc.next();
		String line3 =  sc.next();
		String line4 =  sc.next();


		Sales sale = new Sales(line1,line2,line3,line4 );
		salesHoldArray[sales_counter] = sale;
		++sales_counter;
		  
		  

		
		  
			
			
		}
		 
		
	
	sc.close();
	
}
catch(IOException e)
{
	System.out.println("file not found");
}




		
		
		
	}
	
	
	public void start_2() {
		int counter = 0;
    	try
{	
	sc = new Scanner(new File("data/Customers.csv"));
	sc.useDelimiter(",|\\n");
	sc.next();
	sc.next();
	sc.next();
	sc.next();
	sc.next();


	
	while(sc.hasNext()) {
		
		
		/* for S1 */
		
		
		String line1 = sc.next();
		String line2 = sc.next();
		String line3 =  sc.next();
		String line4 =  sc.next();
		String line5 =  sc.next();


		Customer customer = new Customer(line1,line2,line3,line4,line5 );
		customersHoldArray[counter] = customer;
		++counter;
		
		  

		
		  
			
			
		}
		 
		
	
	sc.close();
	
}
catch(IOException e)
{
	System.out.println("file not found");
}
		
	}
	
	public Sales[] salesArray() {

		return salesHoldArray;
	}
	
	public Customer[] customerArray() {
		return customersHoldArray;
	}
	
}
