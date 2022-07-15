package java18project;

public class Week2Assignment {

	public static void main(String[] args) {
		// week2 lab
		
		int age = 14;
		
		System.out.println(age>=16);
		
		age = 18;
		
		System.out.println(age>=16);
		
		boolean hasLicense = true;	
		
		 	if(age>=16 && hasLicense) {
			
		 		System.out.println("You can drive");
		 		}
		
		 		else {
		 			System.out.println("you cannot drive");
		 			}
		
		 			double costOfMilk = 6.10;
		 			
		 			int thirstLevel = 3;
		
		 				if(costOfMilk < 2.50 || thirstLevel > 6) {
			
		 					System.out.println("Milk Please");
		 					}
		
		 					else {	
			
		 						System.out.println("No thanks");
		 						}
		 				
		 				// else if example lab
		 				
		 						int numberOfcookies = 22;
		 						int numberOfchildren = 3;
		
		 			if(numberOfcookies % numberOfchildren == 0) {
		 					System.out.println("sad face");
		 					}
		 			else if(numberOfcookies % numberOfchildren >= 2 ) {
		 					System.out.println("whoohoooo");
		 					}
		 			else if(numberOfcookies % numberOfchildren > 0) {
		 					System.out.println("yessss");
		 					}
		
		 			else {
			
		 					System.out.println("jackpot!");
		 					}
		 			
		 			//switch example  lab
		 			
		 			String loyaltyMemeberstatus = "Gold";
		 			double loyaltyMemberDiscount = 0.0;
		 			
		 			switch(loyaltyMemeberstatus) {
		 			
		 			case  "SILVER":
		 				
		 				loyaltyMemberDiscount = .1;
		 				
		 				break;
		 				
		 			case "Gold":
		 				loyaltyMemberDiscount = .15;
		 				
		 				break;
		 				
		 			case "platinum":
		 				loyaltyMemberDiscount = .25;
		 				
		 				break;
		 				}
		 			System.out.println(loyaltyMemberDiscount);
		 			
		 // conversion of silver to gold and gold to platinum
		 			
		 			double billTotal = 560;
		 			double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
	
		 			System.out.println(adjustedTotal);
		 			
		 			if(adjustedTotal > 500) {
		 				if(loyaltyMemeberstatus == "SILVER") {
		 					
		 					loyaltyMemeberstatus = "Gold";
		 					}
		 				} 
		 			else if(loyaltyMemeberstatus == "Gold") {
		 				
		 				loyaltyMemeberstatus = "platinum";
		 			}
		 			
		 			System.out.println(loyaltyMemeberstatus);
		 			
		 //------------------
		 			
		 			String username = "Tommy123";
		 			String password = "12345";
		 			
		 		// if(username== "Tommy123" && password == "12345" ) {
		 				 
		 		//System.out.println("login Successful");
		 		// }
		 				if(username.equals("Tommy123") && password.equals("12345") ) {
			 				 
			 				 System.out.println("login Successful");
			 				  }
		 			 else {
		 				 System.out.println("Access denied");
		 			 }
		 // loops
		 				for(int i = 0 ; i < 10; i++) {
		 					
		 					System.out.println(i);
		 				}
		 				for(int i = 10; i >=0; i--) {
		 					
		 				   System.out.println(i);
		 				}
		 				for(int i =0; i<=100; i++) {
		 					if(i % 2 == 0) {
		 					System.out.println(i);
		 					}
		 				}
		 				
		 				for(int i = 0; i <= 100; i++) {
		 					
		 					if(i % 2 == 0) {
		 						System.out.println(i  +" " +  "Even");
		 					}
		 					else {
		 						System.out.println(i  + " " +"Odd");
		 						} 
		 				
		 					 }
		 				
		 				int i = 100;
		 				
		 				while(i >= 0) {
		 					
		 					System.out.println(i + " "+ (i % 3));
		 					
		 					i--;
		 				}
		 					
		 					
	}
}	


