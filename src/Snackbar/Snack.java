package Snackbar;

public class Snack 
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachingId;

	public Snack(String name, int quantity, double cost, int vendingMachingId)
	{

		// snack state variables
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachingId = vendingMachingId;
	}

	// getter and setter methods

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


	public int getQuantity() 
	{
		return quantity;
	}

	public double getCost() 
	{
		return cost;
	}

	public void setCost(double cost) 
	{
		this.cost = cost;
	}

	public int getVendingMachineId() 
	{
		return vendingMachingId;
	}

	public void setVendingMachineId(int vendingMachingId)
	{
		this.vendingMachingId = vendingMachingId;
	}

	// other methods

	public void addQuantity(int quantity)
	{
		this.quantity = this.quantity + quantity;
	}

	public void buySnack(int quantity)
	{
		this.quantity = this.quantity - quantity;
	}

	public double getTotalCost(int quantity)
	{
		return cost * quantity;
	}


}
