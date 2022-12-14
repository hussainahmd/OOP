// Name: Muhammad Usman // Roll no.: SP22-BCS-118 // Sectoin A

// Program for creating a Computer called the Simpletron

import java.util.Scanner; // class scanner is used in program

public class SP22_BCS_118{

	// declaring and initializing final variables
	private static final int READ = 10;
	private static final int WRITE = 11;
	private static final int LOAD = 20;
	private static final int STORE = 21;
	private static final int ADD = 30;
	private static final int SUBTRACT = 31;
	private static final int DIVIDE = 32;
	private static final int MULTIPLY = 33;
	private static final int BRANCH = 40;
	private static final int BRANCHNEG = 41;
	private static final int BRANCHZERO = 42;
	private static final int HALT = 43;

	// declaring an array of size 100
	private static int[] array = new int[100];

	// declaring variables
	private static int opcode=0;
	private static int operand=0;
	private static int accumulator=0;
	private static int register=0;
	private static int counter;
	private static boolean code=true;
	
	public static void main(String[] args){

		System.out.println("\n AoA, Welcome to Simpletron");

		// here "for loop" is used for store elements of "args" to "array"
		for( int i=0 ; i<args.length ; i++ ){
			
			array[i] = Integer.parseInt(args[i]); // converting string to integer
		
			// here "if condition" is used for check Insructions, entered at command line
			if( array[i] < -9999 || array[i] > 9999 ){
				System.out.printf("\n Invalid Instruction found at location %d%n" , i );
				System.exit(0); // for finishing the whole program
			}
		}		

		for( counter=0 ; (counter<array.length) && (code==true) ; counter++ ){ 
			
			register = array[counter]; // stores the Instruction
			
			// for storing first-two numbers of current Instruction
			opcode = Math.abs(register) / 100;
			// for storing last-two numbers of current Instruction
			operand = Math.abs(register) % 100;

			sampleDump(); // calling a sampleDump method
			
			// for check and perform the tasks of operation code
			switch(opcode){
				
				case READ:
					// create scanner to obtain input from user
					Scanner input = new Scanner(System.in);

					do{
						System.out.print("\n Enter an integer : "); // prompte
						array[operand] = input.nextInt(); // stores the input from user
						
						if( array[operand] < -9999 || array[operand] > 9999 ){
							System.out.print(" Invalid input found.");
						}
					}while( array[operand] < -9999 || array[operand] > 9999 );
					// loop is used for check valid input from user 

					break;
					
				case WRITE:	
					// displays the number, present at index "operand" in the array
					System.out.printf("\n Your number is : %d%n" , array[operand]);
					break;
					
				case LOAD:
					// stores the number present at index "operand" of array to the "accumulator" 
					accumulator = array[operand];
					break;
					
				case STORE:
					// stores the number present in the "accumulator" to the index "operand" of array
					array[operand] = accumulator;
					break;
					
				case ADD:
					// sum of number in the "accumulator" and the number at index "operand" of the array
					// and stores their result in the "accumulator"
					accumulator = accumulator + array[operand];

					// if value of "accumulator" increses than 4 digit number 
					if( accumulator < -9999 || accumulator > 9999 ){
						System.out.println("\n Accoumulator overflows.");
						System.out.println(" Simpletron execution abnormally terminated.");
						code=false;
					}

					break;
					
				case SUBTRACT:
					// subtacting number at index "operand" of the array from the number in "accumulator"
					// and stores their result in the "accumulator"
					accumulator = accumulator - array[operand];

					// if value of "accumulator" increses than 4 digit number 
					if( accumulator < -9999 || accumulator > 9999 ){
						System.out.println("\n Accoumulator overflows.");
						System.out.println(" Simpletron execution abnormally terminated.");
						code=false;
					}

					break;

				case DIVIDE:
					// if zero is stored at the index "operand" of array
					if( array[operand]==0 ){
						System.out.println("\n Attempt to divide by zero.");
						System.out.println(" Simpletron execution abnormally terminated.");
						code=false;
						break;
					}

					// dividing a number in "accumulator" by the number at index "operand" of the array
					// and stores their result in the "accumulator"
					accumulator = accumulator / array[operand];
					break;
					
				case MULTIPLY:
					// multiplying a number in "accumulator" and the number at index "operand" of the array
					// and stores their result in the "accumulator"
					accumulator = accumulator * array[operand];
					if( accumulator < -9999 || accumulator > 9999 ){
						System.out.println("\n Accoumulator overflows.");
						System.out.println(" Simpletron execution abnormally terminated.");
						code=false;
					}
					break;

				case BRANCH:
					// counter jumps to the value stored in operand
					counter = operand;
					counter--;
					break;
					
				case BRANCHNEG:
					if( accumulator<0 ){
						// if value in the accumulator is negative 
						// then counter jumps to the value stored in the operand
						counter = operand;
						counter--;
					}
					break;

				case BRANCHZERO:
					if( accumulator==0 ){
						// if value in the accumulator is zero 
						// then counter jumps to the value stored in the operand
						counter = operand;
						counter--;
					}
					break;
					
				case HALT:
					System.out.println("\n The program has completed its tasks.");
					System.out.println(" Simpletron execution terminated.");
					code=false;
					break;
					
				default:
					System.out.println("\n Attempt to execute Invalid operation code.");
					System.out.println(" Simpletron execution abnormally terminated.");
					code=false;
					break;
							
			}

			System.out.println("\n*************************");

			if( code==false ){
				sampleDump(); // calling a sampleDump method
			}
		}
	}

	public static void sampleDump(){

		System.out.println("\n REGISTERS:");
		if( accumulator<0 ){
			System.out.printf(" accumulator          %05d%n" , accumulator );
		}
		if( accumulator>=0 ){
			System.out.printf(" accumulator          +%04d%n" , accumulator );
		}				
		System.out.printf(" instructionCounter      %02d%n" , counter );
		if( register<0 ){
			System.out.printf(" instructionRegister  %05d%n" , register );
		}
		if( register>=0 ){
			System.out.printf(" instructionRegister  +%04d%n" , register );
		}
		System.out.printf(" operationCode           %02d%n" , opcode );
		System.out.printf(" operand                 %02d%n" , operand );
		
		System.out.println("\n MEMORY:");
		
		for( int j=0 ; j<array.length ; j++ ){
			
			if( j==0 ){
				System.out.print("    ");

				for( int k=0 ; k<10 ; k++ ){
					System.out.printf(" %5d " , k );
				}
			}
			if( j%10==0 ){
				System.out.println();
				System.out.printf(" %2d " , j );
			}
			if( array[j]<0 ){
				System.out.printf(" %05d " , array[j] );
			}
			if( array[j]>=0 ){
				System.out.printf(" +%04d " , array[j] );
			}
		}
		
		System.out.println();
	}
}