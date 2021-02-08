package Snackbar;

public class Main 
{
	private static void operateSnackbar()
	{
		System.out.println("Snackbar is open!");
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


	}

	public static void main(String[] args)
	{
		operateSnackbar();
	}
}
