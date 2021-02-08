package Snackbar;

public class Customer 
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashOnHand;


	public Customer(String name, double cashOnHand)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	// setter and getter methods

	public int getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getCashOnHand()
	{
		return cashOnHand;
	}

	// other methods

	public void addCash(double cash)
	{
		this.cashOnHand = this.cashOnHand + cash;
	}

	public void buySnacks(double purchasePrice)
	{
		this.cashOnHand = this.cashOnHand - purchasePrice;
	}
}