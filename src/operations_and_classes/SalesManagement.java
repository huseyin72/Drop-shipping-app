package operations_and_classes;
import file_operations.File_class;

public class SalesManagement {

	public SalesManagement() {
		// TODO Auto-generated constructor stub
	}
	
	private Sales[][] allSales2Darray = File_class.twoDimensionalSalesHold;
	
	public Sales[][] allSales2DarrayGetter(){
		
		return allSales2Darray;
		
	}

}

