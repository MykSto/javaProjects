package shoppingCartApp;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop extends Cart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shop shoppingCart = new Shop();

		int itemID;
		ItemType itemType = null;
		String itemName;
		double itemPrice;
		int itemQuantity;
		int ch;
		String choice;

		// create items map
		Map<Integer, Item> allItems = new LinkedHashMap<Integer, Item>();
		// add elements
		Item item1 = new Item(1001, "Car", 5000.00, itemType, 0);
		Item item2 = new Item(1002, "Toy", 15.35, itemType, 0);
		Item item3 = new Item(1003, "iPod", 300.00, itemType, 0);
		Item item4 = new Item(1004, "Laptop", 999.99, itemType, 0);
		allItems.put(item1.getItemID(), item1);
		allItems.put(item2.getItemID(), item2);
		allItems.put(item3.getItemID(), item3);
		allItems.put(item4.getItemID(), item4);

		boolean isTrue = true;
		while (isTrue) {
			System.out.println("Menu:");
			System.out.println("0) Exit " + "\n" + "1) Add item in shopping cart" + "\n"
					+ "2) Remove item from shpping cart" + "\n" + "3) Display Items" + "\n" + "4) Cash Out");
			ch = sc.nextInt();

			switch (ch) {
			case 0:
				isTrue = false;

				break;
			case 1:
				System.out.println("Enter item ID: ");
				itemID = sc.nextInt();

				System.out.println("Enter item name: ");
				itemName = sc.next();

				System.out.println("Enter item price: ");
				itemPrice = sc.nextDouble();

				System.out.println("Enter quantity: ");
				itemQuantity = sc.nextInt();

				shoppingCart.add(itemID, itemName, itemPrice, itemType, itemQuantity);
				shoppingCart.printItems();
				shoppingCart.capacityItems();
				break;

			case 2:
				System.out.println("Enter name of the item that you would like to remove: ");
				choice = sc.next();
				shoppingCart.remove(choice);
			case 3:

				Iterator<Item> itemsIterator = allItems.values().iterator();
				while (itemsIterator.hasNext()) {
					itemsIterator.next().printItem();
				}

				// Size of the cart with items
				System.out.println("Size of cart after additions:" + allItems.size());

				String select = sc.next();
				System.out.println(select);
				Item selectedItem = allItems.get(Integer.valueOf(select));
				if (selectedItem != null) {
					selectedItem.printItem();
					shoppingCart.add(selectedItem);
				} else {
					System.out.println("Item with this ID was not found!" + "\n" + "Please Try Again!");
				}
				break;
			case 4:
				shoppingCart.printItems();
				shoppingCart.capacityItems();
				break;
			}

		}
		System.out.println("\n" + "Good luck. Hope to see you again!");
		System.exit(0);
		sc.close();
	}
}