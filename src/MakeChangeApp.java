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
			System.out.printf("%n$%.2f", total);
			System.out.println("");

		} else if (tranApprov = true && tendered == productCost) {
			System.out.println("You have paid the amount in its entirety!");
			System.out.println("Thank you for purchasing!");
		}

		return total;
	}

	// currencyReturned will determine how much of each denomination is returned
	public static void currencyReturned(double total, boolean tranApprov) {
		double rollingTotal = total;
		int placeHolder;

		while (tranApprov == true && rollingTotal != 0.0) {
			
			System.out.println("Result: ");
			
			if (rollingTotal / 20 > 0) {
			
				placeHolder = (int)(rollingTotal / 20);
				rollingTotal = (placeHolder * 20);
				System.out.println(placeHolder + " Twenty");
				rollingTotal = rollingTotal - (placeHolder * 20);
			}
			if (total / 10 > 0) {
				placeHolder = (int)(rollingTotal / 10);
				rollingTotal = (placeHolder * 10);
				System.out.println(placeHolder + " Ten");
				rollingTotal = rollingTotal - (placeHolder * 10);
			}
			if (total / 5 > 0) {
				placeHolder = (int)(rollingTotal / 5);
				rollingTotal = (placeHolder * 5);
				System.out.println(placeHolder + " Five");
				rollingTotal = rollingTotal - (placeHolder * 5);
				
			}
			if (total / 1 > 0) {
				placeHolder = (int)(rollingTotal / 1);
				rollingTotal = (placeHolder * 1);
				System.out.println(placeHolder + " One");
				rollingTotal = rollingTotal - (placeHolder * 1);

			}
			if (total / .25 > 0) {
				placeHolder = (int)(rollingTotal / .25);
				rollingTotal = (placeHolder * .25);
				System.out.println(placeHolder + " 25 Cent");
				rollingTotal = rollingTotal - (placeHolder * .25);

			}
			if (total / .10 > 0) {
				placeHolder = (int)(rollingTotal / .10);
				rollingTotal = (placeHolder * .10);
				System.out.println(placeHolder + " 10 Cent");
				rollingTotal = rollingTotal - (placeHolder * .10);

			}
			if (total / .05 > 0) {
				placeHolder = (int)(rollingTotal / .05);
				rollingTotal = (placeHolder * .05);
				System.out.println(placeHolder + " 5 Cent");
				rollingTotal = rollingTotal - (placeHolder * .05);

			}
			if (total / .01 > 0) {
				placeHolder = (int)(rollingTotal / .01);
				rollingTotal = (placeHolder * .01);
				System.out.println(placeHolder + " 1 Cent");
				rollingTotal = rollingTotal - (placeHolder * .01);

			}

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
