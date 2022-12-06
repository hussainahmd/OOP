import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.FormatterClosedException;

public class labtask{
	public static void main (String[] args) throws IOException, SecurityException, FormatterClosedException{
	try
	{
		Scanner input = new Scanner(Paths.get(args[0]));
		System.out.println();
	
	int size = input.nextInt();
	int[][] array = new int[size][size];
	
	for(int i=0 ; i<array.length ; i++){
		for(int j=0 ; j<array[i].length;j++)
		{
			array[i][j]=input.nextInt();
		}
	}
	System.out.println("_______"); 
	int[][] newarray = new int[size][size];
	for(int i=0;i<array.length;i++){    
		for(int j=0;j<array.length;j++){    
		newarray[i][j]=0;      
			for(int k=0;k<array.length;k++)      
			{      
			newarray[i][j]+=array[i][k]*array[k][j];      
			}  
			System.out.print(newarray[i][j]+" ");  
			}
			System.out.println();    
			}   
			
		try{
			Formatter output = new Formatter(args[1]);
			
			for(int i=0 ;i<newarray.length;i++)
			{
				for(int j=0 ; j<newarray[i].length;j++)
				{
					output.format("%d ", newarray[i][j]);
					
				}
				output.format("%n");
			}
			output.flush();
		}
		catch(FileNotFoundException e){e.getMessage();}
		
	}
	catch (IOException | SecurityException | FormatterClosedException e)
	{
		e.printStackTrace();
	}
}
}