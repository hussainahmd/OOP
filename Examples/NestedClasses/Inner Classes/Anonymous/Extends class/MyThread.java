// Java program to illustrate creating an immediate thread
// Using Anonymous Inner class that extends a Class

// Main class
public class MyThread {

	// Main driver method
	public static void main(String[] args)
	{
		// Using Anonymous Inner class that extends a class
		// Here a Thread class
		Thread t = new Thread() {
		
			// run() method for the thread
			public void run()
			{
				// Print statement for child thread
				// execution
				System.out.println("Child Thread");
			}
		};

		// Starting the thread
		t.start();

		// Displaying main thread only for readability
		System.out.println("Main Thread");
	}
}
