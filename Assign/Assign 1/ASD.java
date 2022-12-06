import java.util.Scanner; //program uses class scanner

public class ASD
{
	//main method begins execution of java application
	public static void main(String[] args)
	{
			//create scanner to obtain input from command line
			Scanner input = new Scanner(System.in);
			System.out.println("$ java SP22_BCS_067");
			
			System.out.println("Please enter +, -, *, /, or Q to quit: ");
			char response = input.next().charAt(0);
				
			do
			{
				System.out.println("Please enter first number");
				int number1 = input.nextInt();
				
				System.out.println("Please enter second number");
				int number2 = input.nextInt();
			
				
				if(response == '+'){
					System.out.println("Result: " + (number1 + number2));
				}
				if(response == '-'){
					System.out.println("Result: " + (number1 - number2));
				}
				if(response == '*'){
					System.out.println("Result: " + (number1 * number2));
				}
				if(response == '/'){
					System.out.println("Result: " + (number1 / number2));
				}

				System.out.println("Please enter +, -, *, /, or Q to quit: ");
				response = input.next().charAt(0);
			
			}while(response != 'Q');

			System.out.println("Thanks for using my calc");
	}
}
//end method main
//end class comparison