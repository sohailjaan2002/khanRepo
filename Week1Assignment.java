package java18project;

public class Week1Assignment {

	public static void main(String[] args) {
		
		int AvailablePlanSeats = 6;
		
		double CostOfGroceries = 23.7;
		
		char MiddleInitial = 'o';
				
		boolean IscoldOutside = true;
		
		String CustomerFirstName = "Sohail";
		
		String StreetAddress = "'123 plantation St'";
		
		
		System.out.println("Avaialble Seats on the Plane: " + AvailablePlanSeats);
		System.out.println("The Cost of Potatoes/kg: " + CostOfGroceries);
		System.out.println(MiddleInitial);
		System.out.println(IscoldOutside);
		System.out.println(CustomerFirstName);
		System.out.println(StreetAddress);
		
		AvailablePlanSeats -= 2 ;
		System.out.println(AvailablePlanSeats);
		
		CostOfGroceries += 2.15;
		System.out.println(CostOfGroceries);
		
		MiddleInitial = 'S';
		System.out.println(MiddleInitial);
		//IscoldOutside = !IscoldOutside   alternative to IscolOutside=false;
		IscoldOutside = false;
		System.out.println(IscoldOutside);
		
		String FullName = CustomerFirstName + " " + MiddleInitial + " Khan";
		System.out.println(FullName);
		
		System.out.println("Customer name is "+ FullName + " and he lives at "+ StreetAddress +".");

	}

}
