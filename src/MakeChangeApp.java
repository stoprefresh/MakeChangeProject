import java.util.Scanner;

public class MakeChangeApp {

		public static void main(String[] args) {
			
			Scanner kb = new Scanner(System.in);
			
			double tendered = 0.0, productCost= 0.0, total;
			
			System.out.println("Enter the cost of a product: ");
			productCost = kb.nextDouble();
			
			System.out.println("Enter the amount tendered: ");
			tendered = kb.nextDouble();
			
			total = returnCalc(tendered, productCost);
			
			//Prompt user for value
			
			//Prompt user for amount tendered, and get input
			
			//This will take sometime to complete.
			
			kb.close();
		}
		
		public static double returnCalc(double tendered, double productCost) {
			double total = 0.0;
			
			
			
			
			return total;
		}
		
		public static void currencyReturned(double tendered) {
			
			
			
		}
		
		public static boolean errorCheck(double tendered, double productCost) {
			boolean transApprov = false;
			
			return transApprov;
		}
}
