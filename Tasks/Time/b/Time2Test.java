public class Time2Test {
	
    public static void main(String[] args) {
		
		Time2 t1 = new Time2(); // 00:00:00
        Time2 t2 = new Time2(2); // 02:00:00
        Time2 t3 = new Time2(21, 34); // 21:34:00
        Time2 t4 = new Time2(12, 25, 42); // 12:25:42
        Time2 t5 = new Time2(t4); // 12:25:42
		
        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);
        
        // attempt to initialize t6 with invalid values
        try {
            Time2 t6 = new Time2(27, 74, 99); // invalid values
        }
        catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
		
		//t4.setHour(5);
		//t4.setMinute(39);
		//t4.setSecond(9);
		t4.setTime(19, 34, 47);
		
		System.out.printf("%n%d%n", t4.getHour());
		System.out.printf("%d%n", t4.getMinute());
		System.out.printf("%d%n", t4.getSecond());
		displayTime("Time is ", t4);
    }
    
    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n %s%n %s%n", header, t.toUniversalString(), t.toString());
    }
}