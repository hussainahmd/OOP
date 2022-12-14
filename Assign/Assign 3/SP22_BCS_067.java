import java.util.*;

public class SP22_BCS_067 {
	
	public static void main(String[] args) {
		
		try{
			//Arguments order : name/hour/minute/second/farz/sunnah
			Salat fajar = new Salat("FaJar",5,30,0,2,2);
			Salat zuhar = new Salat("ZuHaR",12,45,30,4,6);
			Salat asar = new Salat("AsAr",15,50,25,4,4);
			Salat maghrib = new Salat("MaGhriB",17,15,15,3,2);
			Salat isha = new Salat("IsHa",18,30,12,4,6);
			
			List<Salat> list = new ArrayList<Salat>();
			list.add(fajar);
			list.add(maghrib);
			list.add(isha);
			list.add(zuhar);
			list.add(asar);
			
			System.out.printf("%nAoA, welcome to SalatTest%n%n");
			System.out.printf("Unsorted Salats data%n%s%n",list);
			
			Collections.sort(list);
			System.out.printf("Salats sorted according to time(default order)%n%s%n",list);
			
			Collections.sort(list, new FarzCompare());
			System.out.printf("Salats sorted according to number of farz%n%s%n",list);
			
			Collections.sort(list, new NameCompare());
			System.out.printf("Salats sorted according to name%n%s%n",list);
			
			Collections.sort(list, new SunnahCompare());
			System.out.printf("Salats sorted according to number of sunnah%n%s%n",list);
		}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		
	}		
}

class Salat implements Comparable<Salat>{
	
	private final String name;
	private Time time;
	private final int farz;
	private final int sunnah;
	
	//Salat constructor which takes name, time(hour, minute, second), no. of farz and no. of sunnah as arguments
	public Salat(String name, int hours, int minute, int second, int farz, int sunnah){
		
		name = name.toLowerCase(); //doing this to format the string's letter case in line 57 (eg.) "mAGhriB" = Maghrib
		validate(name, farz, sunnah);
		
		this.name = name.substring(0,1).toUpperCase() + name.substring(1);
		time = new Time(hours, minute, second);
		this.farz = farz;
		this.sunnah = sunnah;
	}
	
	//get methods
	public String getName(){return name;}
	
	public int getFarz(){return farz;}
	
	public int getSunnah(){return sunnah;}
	 
	public Time getTime(){return time;}
	
	//input validation for Salat name, number of farz and number of sunnah
	private void validate(String name, int farz, int sunnah) throws IllegalArgumentException{
		//check for any incorrect Salat name
		if(!(name.equals("fajar") || name.equals("zuhar") || name.equals("asar") || name.equals("maghrib") || name.equals("isha"))){
			throw new IllegalArgumentException("Incorrect name for Salat");
		}
		//validate no. of farz and no. of sunnah with their respective Salat
		if(name.equals("fajar") && farz != 2 | sunnah != 2){
			if(farz != 2 && sunnah == 2){throw new IllegalArgumentException("Number of farz for Fajar must be 2");}
			if(sunnah != 2 && farz == 2){throw new IllegalArgumentException("Number of sunnah for Fajar must be 2");}
			else{throw new IllegalArgumentException("Number of farz and sunnah for Fajar must be 2 2");}
		}
		if(name.equals("zuhar") && farz != 4 | sunnah != 6){
			if(farz != 4 && sunnah == 6){throw new IllegalArgumentException("Number of farz for Zuhr must be 4");}
			if(sunnah != 6 && farz == 4){throw new IllegalArgumentException("Number of sunnah for Zuhr must be 6");}
			else{throw new IllegalArgumentException("Number of farz and sunnah for Zuhr must be 4 6");}
		}
		if(name.equals("asar") && farz != 4 | sunnah != 4){
			if(farz != 4 && sunnah == 4){throw new IllegalArgumentException("Number of farz for Asar must be 4");}
			if(sunnah != 4 && farz == 4){throw new IllegalArgumentException("Number of sunnah for Asar must be 4");}
			else{throw new IllegalArgumentException("Number of farz and sunnah for Asar must be 4 4");}
		}
		if(name.equals("maghrib") && farz != 3 | sunnah != 2){
			if(farz != 3 && sunnah == 2){throw new IllegalArgumentException("Number of farz for Maghrib must be 3");}
			if(sunnah != 2 && farz == 3){throw new IllegalArgumentException("Number of sunnah for Maghrib must be 2");}
			else{throw new IllegalArgumentException("Number of farz and sunnah for Maghrib must be 3 2");}
		}
		if(name.equals("isha") && farz != 4 | sunnah != 6){
			if(farz != 4 && sunnah == 6){throw new IllegalArgumentException("Number of farz for Isha must be 4");}
			if(sunnah != 6 && farz == 4){throw new IllegalArgumentException("Number of sunnah for Isha must be 6");}
			else{throw new IllegalArgumentException("Number of farz and sunnah for Isha must be 4 6");}
		}
	}
	
	// default ordering of Salat is time
	@Override
	public int compareTo(Salat s){
		if(time.compareTo(s.time) == 0)
			return 0;
		
		if(time.compareTo(s.time) == -1)
			return -1;
			
		else return 1;
	}
	
	@Override
	public String toString(){
		return String.format("%s has %d farz, %d sunnah and is held at %s%n", getName(), getFarz(), getSunnah(), getTime());
	}
}

//Ordering of salat with respect to name
class NameCompare implements Comparator<Salat>{
	
	@Override
	public int compare(Salat a, Salat b){
		if(a.getName().equals(b.getName()))
			return 0;
		
		return a.getName().compareTo(b.getName());
	}
}

//Ordering of salat with respect to number of farz
class FarzCompare implements Comparator<Salat>{
	
	@Override
	public int compare(Salat a, Salat b){
		if(a.getFarz() == b.getFarz())
			return new NameCompare().compare(a, b);
		
		if(a.getFarz() < b.getFarz())
			return -1;
		
		else
			return 1;
	}
}

//Ordering of salat with respect to number of sunnah
class SunnahCompare implements Comparator<Salat>{
	
	@Override
	public int compare(Salat a, Salat b){
		if(a.getSunnah() == b.getSunnah())
			return new NameCompare().compare(a, b);
		
		if(a.getSunnah() < b.getSunnah())
			return -1;
		
		else
			return 1;
	}
}

//Time class to be used for the Salat timings
class Time implements Comparable<Time> {
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59
	
	//compare time
	@Override
	public int compareTo(Time t){
		if(this.hour == t.getHour()){
			if(this.minute == t.getMinute()){
				if(this.second == t.getSecond()){
					return 0;
				}
				if(this.second < t.getSecond()){
					return -1;
				}
				else{
					return 1;
				}
			}
			if(this.minute < t.getMinute()){
				return -1;
			}
			else{
				return 1;
			}
		}
		if(this.hour < t.getHour()){
			return -1;
		}
		else{
			return 1;
		}
	}
	
	// Time constructor: hour, minute and second supplied
	public Time(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// Time constructor: another Time object supplied
	public Time(Time time){
		// invoke constructor with three arguments
		this(time.hour, time.minute, time.second);
	}
	
	 // Set Methods
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
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// validate and set hour
	public void setHour(int hour) {
		if (hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		
		this.hour = hour;
	}
	
	// validate and set minute
	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("minute must be 0-59");
		}
		
		this.minute = minute;
	}
	
	// validate and set second
	public void setSecond(int second) {
		if (second < 0 || second >= 60) {
			throw new IllegalArgumentException("second must be 0-59");
		}
		
		this.second = second;
	}
	
	// Get Methods
	// get hour value
	public int getHour() {return hour;}
	
	// get minute value
	public int getMinute() {return minute;}
	
	// get second value
	public int getSecond() {return second;}
	
	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format(
			"%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s",
		((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
		getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}