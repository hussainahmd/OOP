// Java program to illustrate defining a thread
// Using Anonymous Inner class that define inside argument

// Main class
public class MyThread {
	// Main driver method
	public static void main(String[] args)
	{
		// Using Anonymous Inner class that define inside
		// argument
		// Here constructor argument
		Thread t = new Thread(new Runnable() {
		
			public void run()
			{
				System.out.println("Child Thread");
			}
		});

		t.start();

		System.out.println("Main Thread");
	}
}
