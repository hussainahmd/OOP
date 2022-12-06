// Name: Muhammad Usman // Roll no.: SP22-BCS-118 // Section A

/* A simple calculator which can perform for basic math opertation.
   i.e, addition, subtraction, multiplication and division. */

import java.util.Scanner; // class scanner is used in program

public class ASD2 {
	
	// main method begins execution of JAVA application
	public static void main(String[] args){
		
		// create Scanner to obtain input from command line
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n$ java SP22_BCS_118"); // printing student's Roll no.

		// declaring variables
		char response;
		int result=0;
		float Result=0f;
		
		// here "do...while loop" is used to ask the user for perform math operations again and again
		do{
			// prompt for input from user
			System.out.printf("\nPlease enter +, -, *, / or Q to quit : ");
			response = input.next().charAt(0); // read character that user enters 
			
			// here "if condition" is used for distinguish between command for math operators or quit commmand
			if( response == '+' || response == '-' || response == '*' || response == '/' ){
				
				System.out.print("\nPlease enter first number : "); // prompt
				int number1 = input.nextInt(); // read first number that user enters
				
				System.out.print("Please enter second number : "); // prompt
				int number2 = input.nextInt(); // read second number that user enters
				
				// here four "if conditions" are used for distinguish between four maths operators

				if( response == '+' ){
					result = number1 + number2; // addition of given two numbers
					System.out.println("\nResult : " + result); // display result
				}
				
				if( response == '-' ){
					result = number1 - number2; // subtraction of given two numbers
					System.out.println("\nResult : " + result); // display result
				}
				
				if( response == '*' ){
					result = number1 * number2; // multiplication of given two numbers
					System.out.println("\nResult : " + result); // display result
				}
				
				if( response == '/' ){
					Result = (float)number1 / (float)number2; // division of given two numbers
					System.out.println("\nResult : " + Result); // display result
				}
			}
			
		} while( response != 'Q' ); // "do...while" loop ends when user enters Q for quit
		
		System.out.println("\nThanks for using mycalc");
	}
}
