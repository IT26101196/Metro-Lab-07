import java.util.Scanner;

public class IT26101196Lab7Q3 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Declare the initial constants 
		final double discountRate = 0.05;
		final double numberOfCustomers = 5;
		
		//Declare the variables 
        double billAmount , amountToPay;
		char paymentMode;
		
		//Declare and initizialise variables 
		double discount = 0 ;
		
		//for each customer 
		for (int customerCount = 1 ; customerCount <= numberOfCustomers ; customerCount++) {
			
			System.out.println("Customer" + customerCount);
			
			//Input total bill 
			System.out.print("Enter total bill amount:");
			billAmount = input.nextDouble();
			
			//Mode of payment
			System.out.print("Enter mode of payment:");
			paymentMode = input.next().toUpperCase().charAt(0);
			
			//Check mode of payment 
			if (paymentMode == 'C'){
				
				//Calculate discount and amount to be paid 
				discount = billAmount * discountRate;
				amountToPay = billAmount - discount;
				
				//Print discount and payment mode 
				System.out.println("Discount:" + discount);
				System.out.println("Amount to be paid:" + amountToPay);
			}
			
			else if (paymentMode == 'O') {
				
				//Calculation
				amountToPay = billAmount;
				
				//Print bill amount 
				System.out.println("No discount");
				System.out.println("Amount to be paid:" + amountToPay);
			}
			
			else {
				System.out.println("Invalid payment method");
				System.out.println();
				
				continue; 
			}
			
			System.out.println();
		}
	}
}

				
			
			
				
			
		