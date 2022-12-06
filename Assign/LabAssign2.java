//Hussain Ahmad
//SP22-Bcs-067
import java.util.Scanner;

public class LabAssign2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to my Tax Calculator, enter\n1 for Single\n2 for Married without children");
		System.out.println("3 for Married with children\n\n0 to terminate the program\n");
		
		int response = 0;
		int incomeA = 0;
		int incomeB = 0;
		int numChild, total;
		double tax = 0;
		
		//System.out.print("Please enter the value between 0 and 3 : ");
		//int response = input.nextInt();//taking response of the user
				
		do
		{
			do{
			System.out.print("Please enter the value between 0 and 3 : ");
			response = input.nextInt();//taking response of the user
			
			}while(response < 0 || response > 3);
			
			switch(response)
			{
				case 1://case for single person
					{
						do{//using loop to input income again if less than 0
						System.out.print("Please enter annual income : ");
						incomeA = input.nextInt();
						
						}while(incomeA < 0);
						
						if(incomeA < 10000){
							tax = incomeA * 0.2;
							System.out.printf("Your tax amount is : %.2f", tax);
						}
						else{
							tax = incomeA * 0.3;
							System.out.printf("Your tax amount is : %.2f", tax);
						}
							
						System.out.println();
						System.out.println();
						break;
					}
					case 2:
					{
						do{//using loop to input income again if less than 0
						System.out.print("Please enter husband's annual income : ");
						incomeA = input.nextInt();
						}while(incomeA < 0);
						do{//using loop to input income again if less than 0
						System.out.print("Please enter wife's annual income : ");
						incomeB = input.nextInt();
						}while(incomeB < 0);
						
						total = incomeA + incomeB;//combined income
						
						if(total < 10000){
							tax = total * 0.25;
						}
						else{
							tax = total * 0.4;
						}
						System.out.printf("Your tax amount is : %.2f", tax);
					
						System.out.println();
						System.out.println();
						break;
					}
					case 3:
					{
						do{//using loop to input income again if less than 0
						System.out.print("Please enter husband's annual income : ");
						incomeA = input.nextInt();
						}while(incomeA < 0);
						do{//using loop to input income again if less than 0
						System.out.print("Please enter wife's annual income : ");
						incomeB = input.nextInt();
						}while(incomeB < 0);
						do{//using loop to input num of child again if less than 0
						System.out.print("Please enter number of children : ");
						numChild = input.nextInt();
						}while(incomeB < 0);
						
						total = incomeA + incomeB;//combined income
						
						if(total < 10000){
							tax = total * 0.25;
							tax = tax - (numChild * 2000);
						}
						else{
							tax = total * 0.4;
							tax = tax - (numChild * 2000);
						}
						System.out.printf("Your tax amount is : %.2f", tax);
						
						System.out.println();
						System.out.println();
						break;
					}
					
			}
			
		}while(response != 0);
			
		System.out.println("Thanks for using Tax Calculator");

		
	}
	
}