//lab task 3
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Matrix{
	
	public static void main(String[] args) throws IllegalStateException, NoSuchElementException, IOException {
		
		try{
			Scanner dataIn = new Scanner(Paths.get(args[0]));
			int arraySize = 0;
			arraySize = Integer.parseInt(dataIn.next());

			int[][] array1 = new int[arraySize][arraySize];
			int[][] array2 = new int[arraySize][arraySize];
			
			for(int i = 0; i < arraySize; i++){
				for(int j = 0; j < arraySize; j++){
					array1[i][j] = Integer.parseInt(dataIn.next()); 
				}
			}
			
			for(int i = 0; i < arraySize; i++){
				
				for(int j = 0; j < arraySize; j++){
					
					for(int k = 0; k < arraySize; k++){
						
						array2[i][j] += array1[i][k] * array1[k][j];
					}
				}
			}
			
			PrintWriter dataOut = new PrintWriter(args[1]);
			
			for(int i = 0; i < arraySize; i++){
				
				for(int j = 0; j < arraySize; j++){
					
				 dataOut.print(array2[i][j] + " ");
				}
			 dataOut.println();
			}
		 dataOut.flush();
			
		}
		catch (IllegalStateException | NoSuchElementException | IOException e) {
			e.getMessage();
		}
		

    }
}