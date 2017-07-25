//stores clients' info to view, shopping items, add/remove. 
package shoppingCartApp;


public class Cart {

	private int itemCount;
	private static int capacity;
	private Item[] cart = new Item[capacity];
	

	public Cart() {
		itemCount = 0;
		capacity = 10;
		cart = new Item[capacity];	
	}

	public void add(int itemID, String itemName, double itemPrice, ItemType type, int itemQuantity) {
		add(new Item(itemID, itemName, itemPrice, type, itemQuantity));
	}
	
	public void add(Item item){
		cart[itemCount] = item;
		itemCount += 1;
		if (itemCount == capacity) {
			increaseSize();
		}
	}

	public void remove(String itemName) {
		for (int i = 0; i < cart.length; i++) {
			Item remove = (Item) cart[i];
			if (remove != null)
			if (itemName.equals(remove.getItemName())) {
				cart[i] = null;
			}else{
				System.out.println("\n" + "Item " + itemName + " wasn't found.");
			}
		}
		
	}

	private void increaseSize() {
		Item[] item = new Item[capacity + 5];
		for (int i = 0; i < capacity; i++) {
			item[i] = cart[i];
		}
		cart = item;
		item = null;
		capacity = cart.length;
	}
	
	public void printItems() {
		double total = 0;
		for (int i = 0; i < cart.length; i++) {
			Item item = cart[i];
			if(item == null){
				break;
			}
			total += item.getPrice() * item.getQuantity();
			item.printItem();
		}
		System.out.println("Total: $" + total);
	}	
	public void capacityItems(){
		System.out.println("Capacity: " + capacity + "\n" + "Items: " +  itemCount);
	}
}