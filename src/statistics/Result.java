package statistics;

import java.util.Scanner;

public class Result extends Max {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int choice;
		int array[] = new int[10];

		System.out.println("1. Max");
		System.out.println("2. Min");
		choice = input.next().charAt(0);

		// choose function
		switch (choice) {
		case '1':
			System.out.println("Enter the numbers now.");
			for (int i = 0; i < array.length; i++) {
				int next = input.nextInt();
				// sentineil that will stop loop when 999 is entered
				if (next == 999) {
					break;
				}
				array[i] = next;
			}
			getMaxValue(array);
			// get smallest number
			// getMinValue(array);

		}
		//System.out.println("Max value is : " + getMaxValue());
	}
}