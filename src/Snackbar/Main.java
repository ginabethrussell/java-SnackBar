package Snackbar;
import java.text.DecimalFormat;

public class Main 
{
	private static DecimalFormat df = new DecimalFormat("$#,##0.00");
	private static void operateSnackbar()
	{
		System.out.println();
		System.out.println("Snackbar is open!");
		System.out.println();
		//public Customer(String name, double cashOnHand)
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		//public VendingMachine(String name)
		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");



		//public Snack(String name, int quantity, double cost, int vendingMachingId)
		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());

		// processing
		// task 1 - Jane buys 3 sodas
		double janesPurchase = soda.getTotalCost(3);
		soda.buySnack(3);
		jane.buySnacks(janesPurchase);

		String strResult = df.format(jane.getCashOnHand());
		System.out.println("Jane cash on hand " + strResult);
		System.out.println("Quantity of Soda is " + soda.getQuantity());
		System.out.println();

		// task 2 - Jane buys 1 pretzel snack
		janesPurchase = pretzel.getTotalCost(1);
		pretzel.buySnack(1);
		jane.buySnacks(janesPurchase);;
		strResult = df.format(jane.getCashOnHand());
		System.out.println("Jane cash on hand " + strResult);
		System.out.println("Quantity of Pretzel is " + pretzel.getQuantity());
		System.out.println();

		// task 3 - Bob buys 2 sodas
		double bobsPurchase = soda.getTotalCost(2);
		soda.buySnack(2);
		bob.buySnacks(bobsPurchase);

		strResult = df.format(bob.getCashOnHand());
		System.out.println("Bob cash on hand " + strResult);
		System.out.println("Quantity of Soda is " + soda.getQuantity());
		System.out.println();

		// task 4 - Jane finds $10
		jane.addCash(10);
		strResult = df.format(jane.getCashOnHand());
		System.out.println("Jane cash on hand " + strResult);
		System.out.println();

		// task 5 - Jane buys 1 chocolate bar
		janesPurchase = chocolateBar.getTotalCost(1);
		chocolateBar.buySnack(1);
		jane.buySnacks(janesPurchase);
		strResult = df.format(jane.getCashOnHand());
		System.out.println("Jane cash on hand " + strResult);
		System.out.println("Quantity of Chocolate Bar is " + chocolateBar.getQuantity());
		System.out.println();

		// task 6 - Add 12 more pretzel snacks
		pretzel.addQuantity(12);
		System.out.println("Quantity of Pretzel is " + pretzel.getQuantity());
		System.out.println();

		// task 7 - Bob buys 3 pretzel snacks
		bobsPurchase = pretzel.getTotalCost(3);
		pretzel.buySnack(3);
		bob.buySnacks(bobsPurchase);
		strResult = df.format(bob.getCashOnHand());
		System.out.println("Bob cash on hand " + strResult);
		System.out.println("Quantity of Pretzel is " + pretzel.getQuantity());
		System.out.println();

		// Stretch Print Snack object with toString()
		System.out.println(chips);
		System.out.println(chocolateBar);
		System.out.println(pretzel);
		System.out.println(soda);
		System.out.println(water);

	}

	public static void main(String[] args)
	{
		operateSnackbar();
	}
}
