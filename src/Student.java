import java.util.Scanner;


public class Student {
	
	
	
	private static Scanner input;

	public static void main(String[] args) {
		int a;
		
		input = new Scanner(System.in);
					
			System.out.println("*** WELCOME TO STUDENTS SCREENING ***");
			int grade = input.nextInt();
			
			if (grade <= 5){
				System.out.println("Unfortunately, you have failed the test.");
			} 
			
			else switch(grade){
			case 6 :
				a = 6;
				System.out.println("Your grade is: " + a);
				System.out.println("Barely a Passing Grade");
				break;
				
			case 7 :
				a = 7;
				System.out.println("Your result is: " + a);
				System.out.println("A Satisfying Grade");
				break;
				
			case 8 :
				a = 8;
				System.out.println("Your result is: " + a);
				System.out.println("A Well Earner Grade");
				break;
				
			case 9 :
				a = 9;
				System.out.println("Your result is" + a);
				System.out.println("Very Good");
				break;
				
			case 10 :
				a = 10;
				System.out.println("Your grade is: " + a);
				System.out.println("An Excelent Grade");
				break;
				
			default:
			System.out.println("Invalid operation! " + "\n" + "Please try again!");
				break;
			}
			
		}
		
	}


