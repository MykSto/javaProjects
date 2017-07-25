import java.util.Scanner;


public class Baltics {
	
	
	
	private static Scanner input;

	public static void main(String[] args) {
		
		float a, b, result;
		int choice;
		
		input = new Scanner(System.in);
		
//		do{	
			System.out.println("1. Mult");
			System.out.println("2. Div");
			System.out.println("3. Add");
			System.out.println("4. Min");
			System.out.println("5. Exit\n\n");
			System.out.println("Choose the operator(1/2/3/4)");
			choice = input.next().charAt(0);
			
			switch(choice){
			case '1' :
				System.out.println("Type two numbers: ");
				a = input.nextFloat();
				b = input.nextFloat();
				result = a * b;
				System.out.println("Your result is: " + result);
				break;
				
			case '2' :
				System.out.println("Type two numbers: ");
				a = input.nextFloat();
				b = input.nextFloat();
				result = a / b;
				System.out.println("Your result is" + result);
				break;
				
			case '3' :
				System.out.println("Type two numbers: ");
				a = input.nextFloat();
				b = input.nextFloat();
				result = a + b;
				System.out.println("Your result is: " + "\n" + result);
				break;
				
			case '4' :
				System.out.println("Type two numbers: ");
				a = input.nextFloat();
				b = input.nextFloat();
				result = a - b;
				System.out.println("Your result is" + result);
				break;
				
			case '5' :
				System.out.println("Have a good day!");
				System.exit(0);
				break;
				
			default:
			System.out.println("Invalid operation! " + "\n" + "Please try again!");
				break;
			}
//			}while(choice != 5);
			
		}
		
	}

