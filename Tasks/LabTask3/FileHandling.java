//lab task 3
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.PrintWriter;

public class FileHandling{
	
	public static void main(String[] args) throws IOException, NoSuchElementException, IllegalStateException {
		
		//check if no arguments passed
		if(args.length == 0)
			System.err.printf("%s%n", "No arguments passed!");
		
		//check if at least two file names are passed
		else if(args.length < 2)
			System.err.printf("%s%n", "Pass at least two file names as arguments");
		
		//check for valid file name (.txt)
		else if(!args[0].contains(".txt") | !args[1].contains(".txt"))
			System.err.printf("%s%n", "Invalid file names!");
		
		else{
			//main code in try block to handle exceptions
			try{
				Path path = Paths.get(args[0]); //get path of the file and check for it's existence
				if(Files.exists(path)){
					
					Scanner input = new Scanner(path); //use scanner to input data from file
				
					int size = 0;
					size = Integer.parseInt(input.next()); //first element int the file as size
					int[][] arrayIn = new int[size][size]; //array for input
					int[][] arrayOut = new int[size][size]; //array for output
					
					//populating the array with elements from the file
					for(int i = 0; i < size; i++){
						for(int j = 0; j < size; j++){
							arrayIn[i][j] = Integer.parseInt(input.next()); //converting from string to int 
						}
					}
					
					//calculating the square of the matrix and storing it in the output array
					for(int i = 0; i < size; i++){
						
						for(int j = 0; j < size; j++){
							
							for(int k = 0; k < size; k++){
								
								arrayOut[i][j] += arrayIn[i][k] * arrayIn[k][j];
							}
						}
					}
					
					//Using PrintWriter to write the squared matrix in the output file
					PrintWriter output = new PrintWriter(args[1]); //if file does not exist it will be created
					
					//formatting the output to the file
					for(int i = 0; i < size; i++){
						
						for(int j = 0; j < size; j++){
							
							if(j == 6){
								output.print(arrayOut[i][j]);
							}
							else{
								output.print(arrayOut[i][j] + " ");
							}
						}
						output.println();
					}
					
					//flush and close the resources
					output.flush();
					output.close();
					input.close();
				}
				else{
					System.out.printf("%s does not exist%n", path);
				}
			}
			//catch block for catching the exceptions
			catch (IOException | NoSuchElementException | IllegalStateException e) {
					e.getMessage();
				}
				
		}
		

    }
}