//stores items and its prices. Links to actual items.
package shoppingCartApp;

public class Item {
	private int id;
	private String name;
	private double price;
	private ItemType itemType;
	private int quantity;

	public Item(int itemID, String itemName, double itemPrice, ItemType type, int itemQuantity) {
		this.id = itemID;
		this.name = itemName;
		this.price = itemPrice;
		this.itemType = type;
		this.quantity = itemQuantity;
	}

	public int getItemID() {
		return id;
	}

	public String getItemName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public ItemType getItemType(){
		return itemType;
	}
	
	public void printItem(){
		//System.out.printf("\n%-10.10d %30s %10.2f %10d %10.2f", id, name, price, quantity, description);
		System.out.println("Item ID: " + id + "\n" + "Item: " + name + "\n" + 
		"Price: $" + price + "\n" + "Quantity: " + quantity + "\n");
	}
}
