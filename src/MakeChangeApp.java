import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		double tendered = 0.0, productCost = 0.0, total;
		boolean tranApprov;

		System.out.println("Enter the cost of a product: ");
		productCost = kb.nextDouble();

		System.out.println("Enter the amount tendered: ");
		tendered = kb.nextDouble();

		tranApprov = errorCheck(tendered, productCost);
		total = returnCalc(tendered, productCost, tranApprov);

		// Prompt user for value
		currencyReturned(total, tranApprov);
		// Prompt user for amount tendered, and get input
		// This will take sometime to complete.

		kb.close();
	}

	// This method will determine how much currency is returned
	public static double returnCalc(double tendered, double productCost, boolean tranApprov) {
		double total = 0.0;

		if (tranApprov = true && tendered > productCost) {
			total = Math.abs(productCost - tendered);
			System.out.print("\tYour total is ");
			System.out.printf("$%.2f", total); 
			System.out.println("");

		} else if (tranApprov = true && tendered == productCost) {
			System.out.println("You have paid the amount in its entirety!");
			System.out.println("Thank you for purchasing!");
		}
		System.out.println("==============================================");
		return total;
	}

	// currencyReturned will determine how much of each denomination is returned
	public static void currencyReturned(double total, boolean tranApprov) {
		double rollingTotal = total, smallChange = 0.0;
		int placeHolder;

		while (tranApprov == true && rollingTotal != 0.0) {

			System.out.println("Result: ");

			if (rollingTotal / 20 > 0) {

				placeHolder = (int) Math.floor((rollingTotal / 20));
				if (placeHolder > 1) {
					System.out.println(placeHolder + " Twenty dollar bills");
				} else if(placeHolder == 1){
					System.out.println(placeHolder + " a Twenty dollar bill");
				}
				
				rollingTotal = rollingTotal - (placeHolder * 20);
			}
			if (rollingTotal / 10 > 0) {
				placeHolder = (int) Math.floor((rollingTotal / 10));
				if (placeHolder > 1) {
					System.out.println(placeHolder + " Ten dollar bills");
				} else if(placeHolder == 1) {
					System.out.println(placeHolder + " a Ten dollar bill");
				}
				rollingTotal = rollingTotal - (placeHolder * 10);
			}
			if (rollingTotal / 5 > 0) {
				placeHolder = (int) Math.floor((rollingTotal / 5));
				if (placeHolder > 1) {
					System.out.println(placeHolder + " Five dollar bills");
				} else if (placeHolder == 1) {
					System.out.println(placeHolder + " a Five dollar bill");
				}
				rollingTotal = rollingTotal - (placeHolder * 5);

			}
			if (rollingTotal / 1 > 0) {
				placeHolder = (int) Math.floor((rollingTotal / 1));
				if (placeHolder > 1) {
					System.out.println(placeHolder + " One dollar Bills");
				} else if (placeHolder == 1){
					System.out.println(placeHolder + " a One dollar bill");
				}
				rollingTotal = rollingTotal - (placeHolder * 1);

			}
			if (rollingTotal / .25 > 0) {
				smallChange = Math.floor((rollingTotal / .25));
				placeHolder = (int) smallChange;
				if (placeHolder > 1) {
					System.out.println(placeHolder + " Quarters");
				} else if (placeHolder == 1){
					System.out.println(placeHolder + " a Quarter");
				}
				rollingTotal = rollingTotal - (placeHolder * .25);

			}
			if (rollingTotal / .10 > 0) {
				smallChange = Math.floor((rollingTotal / .10));
				placeHolder = (int) smallChange;
				if (placeHolder > 1) {
					System.out.println(placeHolder + " Dimes");
				} else if (placeHolder == 1){
					System.out.println(placeHolder + " a Dime");
				}
				rollingTotal = rollingTotal - (placeHolder * .10);

			}
			if (rollingTotal / .05 > 0) {
				smallChange = Math.floor((rollingTotal / .05));
				placeHolder = (int) smallChange;
				if (placeHolder > 1) {
					System.out.println(placeHolder + " Nickles");
				} else if (placeHolder == 1){
					System.out.println(placeHolder + " a Nickle");
				}

				rollingTotal = rollingTotal - (placeHolder * .05);

			}
			if (rollingTotal / .01 > 0) {
				smallChange = (rollingTotal / .01);
				placeHolder = (int) smallChange;
				if (placeHolder > 1) {
					System.out.println(placeHolder + " Pennies");
				} else if (placeHolder == 1){
					System.out.println(placeHolder + " a Penny");
				}
				rollingTotal = rollingTotal - (placeHolder * .01);

			}
			rollingTotal = 0.0;

		}

	}

	// errorCheck ensures that the customer has given paid enough to proceed
	public static boolean errorCheck(double tendered, double productCost) {
		boolean tranApprov = false;

		if (tendered < productCost) {
			tranApprov = false;
			System.out.println("Insufficient funds to complete this transaction.");
		} else if (tendered >= productCost) {
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
