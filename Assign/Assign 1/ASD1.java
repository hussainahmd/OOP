/*Name: Hussain Ahmad
  Reg:  SP22-BCS-067*/
import java.util.Scanner;
public class ASD1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n$ java SP22_BCS_067");
		
		while(true) //loop will run infinite times unless it gets a terminator value which is 'Q' in this case
		{	
			System.out.print("\nPlease enter +, -, *, / or Q to quit : ");
			char response = input.next().charAt(0);
			
			//terminator condition to break the loop and end the program (when user enters Q)
			if (response == 'Q')
			{
			System.out.print("\nThanks for using my calc\n----------------------------------\n");
			break;
			}	
			
			//getting the input of 1st number as double from the user
			System.out.print("Please enter first number: ");
			double number1 = input.nextDouble();
			
			//getting the input of 2nd number as double from the user
			System.out.print("Please enter second number: "); 
			double number2 = input.nextDouble();
			
			//declaring a variable for result
            double Result; 
			
            System.out.print("Result: ");
			
            //checking response, computing and printing the result according to it
			if (response == '+')
			{
                Result = number1 + number2;    
			    System.out.printf("%.3f%n",Result); //formating the result to 3 decimal places
			}	
			
			if (response == '-')
			{
                Result = number1 - number2;    
			    System.out.printf("%.3f%n",Result);
			}

            if (response == '*')
			{
                Result = number1 * number2;    
			    System.out.printf("%.3f%n",Result);
			}

            if (response == '/')
			{
                Result = number1 / number2;    
			    System.out.printf("%.3f%n",Result);
			}
		}
	}
}
														//END