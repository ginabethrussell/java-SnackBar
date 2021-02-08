package Snackbar;
import java.text.DecimalFormat;


public class Snack 
{
	private static DecimalFormat df = new DecimalFormat("$#,##0.00");
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{

		// snack state variables
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
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
		return vendingMachineId;
	}

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
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

	// override println output for objects
	@Override
	public String toString()
	{
		String vendingMachineName;
		if (vendingMachineId == 1)
		{
			vendingMachineName = "Food";
		}
		else if (vendingMachineId == 2)
		{
			vendingMachineName = "Drink";
		}
		else
		{
			vendingMachineName = "Office";
		}
		String strResult = df.format(this.getTotalCost(this.quantity));
        String rtnStr = 
            "Snack: " + name + "\n" +
            "Vending Machine: " + vendingMachineName + "\n" +
            "Quantity: " + quantity + "\n" +
            "Total Cost: " + strResult + "\n";
        return rtnStr;
    }

}
