import java.util.Scanner;

public class MakeChangeApp {
	// The main is where the user input and calculation methods are called.
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		double tendered = 0.0, productCost = 0.0, total;
		boolean tranApprov;
		do {
		System.out.println("Enter the cost of a product: ");
		productCost = kb.nextDouble();

		System.out.println("Enter the amount tendered: ");
		tendered = kb.nextDouble();
		System.out.println("________________________________________________");
		System.out.println("________________________________________________");
        
		tranApprov = errorCheck(tendered, productCost);
		}
		while(tranApprov == false);
		total = returnCalc(tendered, productCost, tranApprov);

		currencyReturned(total, tranApprov);

		kb.close();
	}

	// This method will determine how much currency is returned
	public static double returnCalc(double tendered, double productCost, boolean tranApprov) {
		double total = 0.0;

		System.out.println("================================================");

		if (tranApprov == true && tendered > productCost) {
			total = Math.abs(productCost - tendered);
			System.out.print("\tYour change is as follows.... ");
			System.out.printf("$%.2f", total);
			System.out.println("");

		} else if (tranApprov = true && tendered == productCost) {
			System.out.println("   You have paid the amount in its entirety!");
			System.out.println("           Thank you for purchasing!");
		}
		System.out.println("================================================");
		return total;
	}
   // each of the following methods calculate and pass a rolling total to determine how much of each denomination should be returned.
	public static double twentyDollar(double total) {
		double rollingTotal = total;
		int placeHolder;

		if (rollingTotal / 20 > 0) {

			placeHolder = (int) Math.floor((rollingTotal / 20));
			if (placeHolder > 1) {
				System.out.println("               " + placeHolder + " Twenty Dollar bills");
			} else if (placeHolder == 1) {
				System.out.println("               " + placeHolder + " Twenty Dollar bill");
			}

			rollingTotal = rollingTotal - (placeHolder * 20);
		}
		return rollingTotal;
	}

	public static double tenDollar(double total) {
		double rollingTotal = total;
		int placeHolder;
		if (rollingTotal / 10 > 0) {
			placeHolder = (int) Math.floor((rollingTotal / 10));
			if (placeHolder > 1) {
				System.out.println("               " + placeHolder + " Ten Dollar bills");
			} else if (placeHolder == 1) {
				System.out.println("               " + placeHolder + " Ten Dollar bill");
			}
			rollingTotal = rollingTotal - (placeHolder * 10);
		}
		return rollingTotal;
	}

	public static double fiveDollar(double total) {
		double rollingTotal = total;
		int placeHolder;
		if (rollingTotal / 5 > 0) {
			placeHolder = (int) Math.floor((rollingTotal / 5));
			if (placeHolder > 1) {
				System.out.println("               " + placeHolder + " Five Dollar Bills");
			} else if (placeHolder == 1) {
				System.out.println("               " + placeHolder + " Five Dollar bill");
			}
			rollingTotal = rollingTotal - (placeHolder * 5);
		}
		return rollingTotal;

	}

	public static double oneDollar(double total) {
		double rollingTotal = total;
		int placeHolder;
		if (rollingTotal / 1 > 0) {
			placeHolder = (int) Math.floor((rollingTotal / 1));
			if (placeHolder > 1) {
				System.out.println("               " + placeHolder + " One Dollar Bills");
			} else if (placeHolder == 1) {
				System.out.println("               " + placeHolder + " One Dollar bill");
			}
			rollingTotal = rollingTotal - (placeHolder * 1);
		}
		return rollingTotal;
	}

	public static double oneQuarter(double total) {
		double rollingTotal = total, smallChange = 0.0;
		int placeHolder;
		if (rollingTotal / .25 > 0) {
			smallChange = Math.floor((rollingTotal / .25));
			placeHolder = (int) smallChange;
			if (placeHolder > 1) {
				System.out.println("               " + placeHolder + " Quarters");
			} else if (placeHolder == 1) {
				System.out.println("               " + placeHolder + " Quarter");
			}
			rollingTotal = rollingTotal - (placeHolder * .25);
		}
		return rollingTotal;

	}

	public static double oneDime(double total) {
		double rollingTotal = total, smallChange = 0.0;
		int placeHolder;
		if (rollingTotal / .10 > 0) {
			smallChange = Math.floor((rollingTotal / .10));
			placeHolder = (int) smallChange;
			if (placeHolder > 1) {
				System.out.println("               " + placeHolder + " Dimes");
			} else if (placeHolder == 1) {
				System.out.println("               " + placeHolder + " Dime");
			}
			rollingTotal = rollingTotal - (placeHolder * .10);
		}
		return rollingTotal;
	}

	public static double oneNickle(double total) {
		double rollingTotal = total, smallChange = 0.0;
		int placeHolder;
		if (rollingTotal / .05 > 0) {
			smallChange = Math.floor((rollingTotal / .05));
			placeHolder = (int) smallChange;
			if (placeHolder > 1) {
				System.out.println("               " + placeHolder + " Nickles");
			} else if (placeHolder == 1) {
				System.out.println("               " + placeHolder + " Nickle");
			}
			rollingTotal = rollingTotal - (placeHolder * .05);
		}
		return rollingTotal;
	}

	public static double onePenny(double total) {
		double rollingTotal = total, smallChange = 0.0;
		int placeHolder;
		if (rollingTotal / .01 > 0) {
			smallChange =(rollingTotal / .01);
			placeHolder = (int) smallChange;
			if (placeHolder > 1) {
				System.out.println("               " + placeHolder+ " Pennies");
			} else if (placeHolder == 1) {
				System.out.println("               " + placeHolder + " Penny");
			}
			rollingTotal = rollingTotal - (smallChange * .01);
		}
		return rollingTotal;

	}

	// currencyReturned will determine how much of each denomination is returned
	public static void currencyReturned(double total, boolean tranApprov) {
		double rollingTotal = total;

		while (tranApprov == true && rollingTotal != 0.0) {

			System.out.println("            Change Breakdown Results:           ");

			rollingTotal = onePenny(oneNickle(oneDime(oneQuarter(oneDollar(fiveDollar(tenDollar(twentyDollar(total))))))));

			
			System.out.println("________________________________________________");
			System.out.println("________________________________________________");
			System.out.println("________________________________________________");
			System.out.println("________________________________________________");
		}

	}

	// errorCheck ensures that the customer has given paid enough to proceed
	public static boolean errorCheck(double tendered, double productCost) {
		boolean tranApprov = false;

		if (tendered < productCost) {
			tranApprov = false;
			System.out.println("Insufficient funds to complete this transaction.");
			System.out.println("________________________________________________");
			System.out.println("_____________Restarting Application_____________");
			System.out.println("________________________________________________");
		} else if (tendered >= productCost) {
			tranApprov = true;
			System.out.println("                   Thank you!");
		}
		System.out.println("________________________________________________");
		System.out.println("________________________________________________");
		System.out.println("________________________________________________");
		System.out.println("________________________________________________");

		return tranApprov;
	}
}
