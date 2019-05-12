import java.util.Scanner;

public class MakeChangeApp {

		public static void main(String[] args) {
			
			Scanner kb = new Scanner(System.in);
			
			double tendered = 0.0, productCost= 0.0, total;
			boolean tranApprov;
			
			System.out.println("Enter the cost of a product: ");
			productCost = kb.nextDouble();
			
			System.out.println("Enter the amount tendered: ");
			tendered = kb.nextDouble();
			
			
			tranApprov = errorCheck(tendered, productCost);
			total = returnCalc(tendered, productCost, tranApprov);
			
			//Prompt user for value
			currencyReturned(tendered, tranApprov);
			//Prompt user for amount tendered, and get input
			//This will take sometime to complete.
			
			kb.close();
		}
		// This method will determine how much currency is returned
		public static double returnCalc(double tendered, double productCost, boolean tranApprov) {
			double total = 0.0;
			
			if (tranApprov = true && tendered > productCost) {
				total = Math.abs(productCost - tendered);
				System.out.printf("%n$%.2f" , total);
				
			}
			else if(tranApprov = true && tendered == productCost){
				System.out.println("You have paid the amount in its entirety!");
				System.out.println("Thank you for purchasing!");
			}
			
			
			
			return total;
		}
		// currencyReturned will determine how much of each denomination is returned
		public static void currencyReturned(double tendered, boolean tranApprov) {
			
			
			
		}
		// errorCheck ensures that the customer has given paid enough to proceed
		public static boolean errorCheck(double tendered, double productCost) {
			boolean tranApprov = false;
			
			if(tendered < productCost) {
				tranApprov = false;
				System.out.println("Insufficient funds to complete this transaction.");
			}
			else if(tendered >= productCost) {
				tranApprov = true;
				System.out.println("Thank you!");
			}
			System.out.println("______________________________________________");
			System.out.println("______________________________________________");
			System.out.println("______________________________________________");
			System.out.println("______________________________________________");
			
			return tranApprov;
		}
}
