public class Time2 {

	private int time;

	// Time2 no-argument constructor:
	// initializes each instance variable to zero
	public Time2(){
		this(0, 0, 0); // invoke constructor with three arguments
	}
	
	// Time2 constructor: hour supplied, minute and second defaulted to 0
	public Time2(int hour){
		this(hour, 0, 0); // invoke constructor with three arguments
	}
	
	// Time2 constructor: hour and minute supplied, second defaulted to 0
	public Time2(int hour, int minute){
		this(hour, minute, 0); // invoke constructor with three arguments
	}
	
	// Time2 constructor: hour, minute and second supplied
	public Time2(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		time = (hour * 3600) + (minute * 60) + second;
	}
	
	// Time2 constructor: another Time2 object supplied
	public Time2(Time2 TIME){
		/*int hour = TIME.time / 3600;
		int min = (TIME.time - (hour * 3600)) / 60;
		int sec = TIME.time - ((hour * 3600) + (min * 60));
		// invoke constructor with three arguments*/
		//this(hour, min, sec);
		this((TIME.time / 3600), ((TIME.time - ((TIME.time / 3600) * 3600)) / 60), (TIME.time - (((TIME.time / 3600) * 3600) + (((TIME.time - (((TIME.time / 3600)) * 3600)) / 60) * 60))));
	}
	
	 // Set Methods
	 // set a new time value using universal time;
	 // validate the data
	 public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			 throw new IllegalArgumentException("hour must be 0-23");
		}
		 
		if (minute < 0 || minute >= 60) {
			 throw new IllegalArgumentException("minute must be 0-59");
		}
		
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		time = (hour * 3600) + (minute * 60) + second;
	}
	
	// validate and set hour
	public void setHour(int hour) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		
		int hr = time / 3600;
		int left = time - (hr * 3600);
		hr = hour;
		time = (hr * 3600) + left;
		 
	}
	
	// validate and set minute
	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		
		int hour = time / 3600;
		int min = (time - (hour * 3600)) / 60;
		int sec = time - ((hour * 3600) + (min * 60));
		min = minute;
		time = ((hour * 3600) + (min * 60)) + sec;
	}
	
	// validate and set second
	public void setSecond(int second) {
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		int hour = time / 3600;
		int min = (time - (hour * 3600)) / 60;
		int sec = time - ((hour * 3600) + (min * 60));
		sec = second;
		time = ((hour * 3600) + (min * 60)) + sec;
	}
	
	// Get Methods
	// get hour value
	public int getHour() {
		int hour = time / 3600;
		return hour;
		}
	
	// get minute value
	public int getMinute() {
		int hour = time / 3600;
		int min = (time - (hour * 3600)) / 60;
		return min;
	}
	
	// get second value
	public int getSecond() {
		int hour = time / 3600;
		int min = (time - (hour * 3600)) / 60;
		int sec = time - ((hour * 3600) + (min * 60));
		return sec;
		}
	
	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}