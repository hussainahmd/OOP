import java.util.*;
public class Time2Test {
	public static void main(String[] args) {
		
		Time2 t1 = new Time2(); // 00:00:00
		Time2 t2 = new Time2(2); // 02:00:00
		Time2 t3 = new Time2(21, 34); // 21:34:00
		Time2 t4 = new Time2(12, 25, 42); // 12:25:42
		Time2 t5 = new Time2(23, 43, 01);
		Time2 t6 = new Time2(9, 12, 27);
		Time2 t7 = new Time2(t4); // 12:25:42
		
		System.out.printf("%n%s", t4.compareTo(t7) == 0 ? "Same" : "Not Same");
		System.out.printf("%n%s%n%n", t4.compareTo(t5) == -1 ? "Lesser" : "Greater");
		
		
		List<Time2> list = new ArrayList<Time2>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		
		System.out.printf("Unsorted Times: %n%s%n",list);
		Collections.sort(list);
		System.out.printf("Sorted Times: %n%s%n",list);
		
	}		
}